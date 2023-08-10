package io.sentry.replay.android.recorder

import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Rect

interface Recorder {
    fun beginFrame()
    fun save()
    fun restore()
    fun restoreToCount(saveCount: Int)
    fun translate(dx: Float, dy: Float)
    fun clipRectF(left: Float, top: Float, right: Float, bottom: Float)
    fun drawRoundRect(
        left: Float,
        top: Float,
        right: Float,
        bottom: Float,
        rx: Float,
        ry: Float,
        paint: Paint
    )

    fun drawCircle(cx: Float, cy: Float, radius: Float, paint: Paint)
    fun drawText(text: CharSequence, start: Int, end: Int, x: Float, y: Float, paint: Paint)
    fun drawRect(r: Rect, paint: Paint)
    fun concat(matrix: Matrix)
    fun scale(sx: Float, sy: Float)
    fun rotate(degrees: Float)
    fun skew(sx: Float, sy: Float)
    fun setMatrix(matrix: Matrix?)
}