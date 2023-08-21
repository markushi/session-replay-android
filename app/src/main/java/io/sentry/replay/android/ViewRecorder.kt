package io.sentry.replay.android

import android.app.Activity
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.CanvasDelegate
import android.util.DisplayMetrics
import android.view.Choreographer
import android.view.View
import android.view.ViewGroup
import io.sentry.replay.android.recorder.ProtoBufCanvasRecorder
import java.util.LinkedList

class ViewRecorder : Choreographer.FrameCallback {

    val canvasCommandRecorder = ProtoBufCanvasRecorder()
    private var canvasDelegate: CanvasDelegate? = null
    private var canvas: Canvas? = null
    private var view: View? = null

    fun setView(view: View?) {
        this.view = view
        Choreographer.getInstance().postFrameCallbackDelayed(this, 0)
    }

    override fun doFrame(frameTimeNanos: Long) {
        view?.let {
            // Log.d("TAG", "doFrame: $frameTimeNanos")
            captureFrame(it)
            Choreographer.getInstance().postFrameCallbackDelayed(this, 1000)
        }
    }

    private fun captureFrame(view: View) {
        if (view.width == 0 || view.height == 0 || view.visibility == View.GONE) {
            return
        }

        if (canvasDelegate == null) {
            val displayMetrics = DisplayMetrics()
            (view.context as Activity).windowManager.defaultDisplay.getMetrics(displayMetrics)
            val bitmap = Bitmap.createBitmap(
                displayMetrics.widthPixels,
                displayMetrics.heightPixels,
                Bitmap.Config.ARGB_8888
            )
            canvas = Canvas(bitmap)
            canvasDelegate = CanvasDelegate(
                canvasCommandRecorder,
                canvas!!
            )
        }

        // reset the canvas first, as it will be re-used for clipping operations
        canvas!!.restoreToCount(1)
        canvasCommandRecorder.beginFrame()

        val location = IntArray(2)
        val items = LinkedList<View?>()
        items.add(view)
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
                    ViewHelper.executeOnDraw(item, canvasDelegate!!)
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