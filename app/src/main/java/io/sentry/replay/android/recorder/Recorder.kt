package io.sentry.replay.android.recorder

import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.RectF

interface Recorder {
    fun beginFrame()
    fun save()
    fun restore()
    fun restoreToCount(saveCount: Int)
    fun translate(dx: Float, dy: Float)
    fun clipRect(rect: Rect)
    fun clipRect(left: Int, top: Int, right: Int, bottom: Int)
    fun clipRectF(left: Float, top: Float, right: Float, bottom: Float)
    fun drawRoundRect(rect: RectF, rx: Float, ry: Float, paint: Paint)
    fun drawCircle(cx: Float, cy: Float, radius: Float, paint: Paint)
    fun drawText(text: CharSequence, start: Int, end: Int, x: Float, y: Float, paint: Paint)
    fun drawRect(r: Rect, paint: Paint)
    fun concat(matrix: Matrix)
}