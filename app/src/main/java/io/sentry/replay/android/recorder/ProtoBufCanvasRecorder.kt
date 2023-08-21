package io.sentry.replay.android.recorder

import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Rect
import android.os.SystemClock
import android.util.Log
import androidx.core.graphics.values
import io.sentry.replay.android.paintToProto
import io.sentry.replay.android.proto.ReplayOuterClass
import io.sentry.replay.android.proto.ReplayOuterClass.CoordinateF

class ProtoBufCanvasRecorder : Recorder {

    companion object {
        private val TAG = "ProtoBufCanvasRecorder"
    }

    private val replayBuilder = ReplayOuterClass.Replay.newBuilder()
    private lateinit var currentFrame: ReplayOuterClass.Frame.Builder

    fun getReplay(): ByteArray = replayBuilder.build().toByteArray()

    override fun beginFrame() {
        Log.d(TAG, "beginFrame")

        currentFrame = replayBuilder
            .addFramesBuilder()
            .setTime(SystemClock.uptimeMillis())
    }

    override fun save() {
        Log.d(TAG, "save")
        currentFrame
            .addCommandsBuilder()
            .payloadBuilder.saveBuilder.build()
    }

    override fun restore() {
        Log.d(TAG, "restore")
        currentFrame
            .addCommandsBuilder()
            .payloadBuilder.restoreBuilder.build()
    }

    override fun restoreToCount(saveCount: Int) {
        Log.d(TAG, "restoreToCount: $saveCount")
        currentFrame
            .addCommandsBuilder()
            .payloadBuilder.restoreToCountBuilder.setCount(saveCount)
    }

    override fun translate(dx: Float, dy: Float) {
        Log.d(TAG, "translate: $dx, $dy")
        currentFrame
            .addCommandsBuilder()
            .payloadBuilder.translateBuilder
            .setCoordinate(
                CoordinateF.newBuilder()
                    .setX(dx)
                    .setY(dy)
                    .build()
            )
    }

    override fun clipRectF(left: Float, top: Float, right: Float, bottom: Float) {
        Log.d(TAG, "clipRectF: l: $left, t: $top, r: $right, b: $bottom")
        currentFrame
            .addCommandsBuilder()
            .payloadBuilder.clipRectFBuilder
            .setRect(
                ReplayOuterClass.RectF.newBuilder()
                    .setTop(top)
                    .setLeft(left)
                    .setRight(right)
                    .setBottom(bottom)
            )
    }

    override fun drawRoundRect(
        left: Float,
        top: Float,
        right: Float,
        bottom: Float,
        rx: Float,
        ry: Float,
        paint: Paint
    ) {

        currentFrame
            .addCommandsBuilder()
            .payloadBuilder
            .drawRoundRectBuilder
            .setRect(
                ReplayOuterClass.RectF.newBuilder()
                    .setTop(top)
                    .setLeft(left)
                    .setRight(right)
                    .setBottom(bottom)
                    .build()
            )
            .setRadii(
                CoordinateF.newBuilder()
                    .setX(rx)
                    .setY(ry)
                    .build()
            )
            .setPaint(paintToProto(paint))
    }

    override fun drawCircle(cx: Float, cy: Float, radius: Float, paint: Paint) {
        Log.d(TAG, "drawCircle: $cx/$cy, r: $radius")
        currentFrame
            .addCommandsBuilder()
            .payloadBuilder
            .drawCircleBuilder
            .setPosition(
                CoordinateF.newBuilder()
                    .setX(cx)
                    .setY(cy)
            )
            .setRadius(radius)
            .setPaint(paintToProto(paint))
    }

    override fun drawText(
        text: CharSequence,
        start: Int,
        end: Int,
        x: Float,
        y: Float,
        paint: Paint
    ) {
        val txt = text.subSequence(start, end).toString()
        Log.d(TAG, "drawText: $x/$y, t: $txt")
        currentFrame
            .addCommandsBuilder()
            .payloadBuilder
            .drawTextBuilder
            .setText(txt)
            .setPosition(
                CoordinateF.newBuilder()
                    .setX(x)
                    .setY(y)
            )
            .setPaint(paintToProto(paint))
    }

    override fun drawRect(r: Rect, paint: Paint) {
        Log.d(TAG, "drawRect: (${r.left}, ${r.top}, ${r.right}, ${r.bottom})")
        currentFrame
            .addCommandsBuilder()
            .payloadBuilder
            .drawRectBuilder
            .setRect(
                ReplayOuterClass.Rect.newBuilder()
                    .setTop(r.top)
                    .setLeft(r.left)
                    .setRight(r.right)
                    .setBottom(r.bottom)
            )
            .setPaint(paintToProto(paint))
            .build().toByteString()

    }

    override fun concat(matrix: Matrix) {
        Log.d(TAG, "concat: (${matrix.values().joinToString(", ")})")
        currentFrame
            .addCommandsBuilder()
            .payloadBuilder
            .concatBuilder
            .addAllMatrix(matrix.values().toList())
    }

    override fun scale(sx: Float, sy: Float) {
        Log.d(TAG, "scale: $sx, $sy")
        currentFrame.addCommandsBuilder()
            .payloadBuilder
            .scaleBuilder
            .setSx(sx)
            .setSy(sy)
    }

    override fun rotate(degrees: Float) {
        Log.d(TAG, "rotate: $degrees")
        currentFrame.addCommandsBuilder()
            .payloadBuilder
            .rotateBuilder
            .setDegrees(degrees)

    }

    override fun skew(sx: Float, sy: Float) {
        Log.d(TAG, "skew: $sx, $sy")
        currentFrame.addCommandsBuilder()
            .payloadBuilder
            .skewBuilder
            .setSx(sx)
            .setSy(sy)
    }

    override fun setMatrix(matrix: Matrix?) {
        Log.d(TAG, "setMatrix: ${matrix?.values()}")
        currentFrame.addCommandsBuilder()
            .payloadBuilder
            .setMatrixBuilder
            .addAllMatrix(matrix?.values()?.toList() ?: emptyList())
    }

}