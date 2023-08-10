package io.sentry.replay.android

import android.content.Context
import android.graphics.Canvas
import android.graphics.CanvasDelegate
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import io.sentry.replay.android.recorder.ProtoBufCanvasRecorder
import java.util.LinkedList

// TODO remove, use Choreographer instead
// it's not really required to add a custom view as we could call draw at any point
// but handy as we get notified for every screen change
class InterceptingView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    val canvasCommandRecorder = ProtoBufCanvasRecorder()
    private var canvasDelegate: CanvasDelegate? = null

    override fun dispatchDraw(canvas: Canvas?) {
        super.dispatchDraw(canvas)


        if (canvasDelegate == null && canvas != null) {
            canvasDelegate = CanvasDelegate(
                canvasCommandRecorder,
                canvas
            )
        }

        // reset the canvas first, as it will be re-used for clipping operations
        canvas!!.restoreToCount(1)

        canvasCommandRecorder.beginFrame()

        val location = IntArray(2)
        val items = LinkedList<View?>()
        items.add(this)
        while (!items.isEmpty()) {
            val item = items.removeFirst()
            if (item != null && item.visibility == View.VISIBLE) {
                if (item is ViewGroup && item.willNotDraw()) {
                    // skip layouts which don't draw anything
                } else {
                    item.getLocationOnScreen(location)
                    val x = location[0].toFloat() + item.translationX
                    val y = location[1].toFloat() + item.translationY

                    val saveCount = canvasDelegate!!.save()
                    canvasCommandRecorder.translate(
                        x, y
                    )
                    PaintHelper.executeOnDraw(item, canvasDelegate!!)
                    canvasDelegate!!.restoreToCount(saveCount)
                }

                if (item is ViewGroup) {
                    item.clipChildren
                    val childCount = item.childCount
                    for (i in 0 until childCount) {
                        items.add(item.getChildAt(i))
                    }
                }
            }
        }
    }
}