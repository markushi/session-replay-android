package io.sentry.replay.android.recorder

import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.RectF
import android.os.SystemClock
import androidx.core.graphics.values
import io.sentry.replay.android.proto.ReplayOuterClass
import io.sentry.replay.android.proto.ReplayOuterClass.ClipRectCommand
import io.sentry.replay.android.proto.ReplayOuterClass.ConcatCommand
import io.sentry.replay.android.proto.ReplayOuterClass.CoordinateF
import io.sentry.replay.android.proto.ReplayOuterClass.DrawCircleCommand
import io.sentry.replay.android.proto.ReplayOuterClass.DrawRectCommand
import io.sentry.replay.android.proto.ReplayOuterClass.DrawRoundRectCommand
import io.sentry.replay.android.proto.ReplayOuterClass.DrawTextCommand
import io.sentry.replay.android.proto.ReplayOuterClass.RestoreCommand
import io.sentry.replay.android.proto.ReplayOuterClass.RestoreToCountCommand
import io.sentry.replay.android.proto.ReplayOuterClass.SaveCommand
import io.sentry.replay.android.proto.ReplayOuterClass.TranslateCommand

class ProtoBufCanvasRecorder : Recorder {

    companion object {
        private const val TYPE_SAVE = "0"
        private const val TYPE_RESTORE = "1"
        private const val TYPE_RESTORE_TO_COUNT = "2"
        private const val TYPE_TRANSLATE = "3"
        private const val TYPE_CLIP_RECT = "4"
        private const val TYPE_CLIP_RECTF = "5"
        private const val TYPE_DRAW_TEXT = "6"
        private const val TYPE_DRAW_ROUND_RECT = "7"
        private const val TYPE_DRAW_CIRCLE = "8"
        private const val TYPE_DRAW_RECT = "9"
        private const val TYPE_CONCAT = "10"
    }

    private val replayBuilder = ReplayOuterClass.Replay.newBuilder()

    private lateinit var currentFrame: ReplayOuterClass.Frame.Builder

    fun getReplay(): ByteArray = replayBuilder.build().toByteArray()

    override fun beginFrame() {
        currentFrame = replayBuilder
            .addFramesBuilder()
            .setTime(SystemClock.uptimeMillis())
    }

    override fun save() {
        currentFrame
            .addCommandsBuilder()
            .setTypeUrl(TYPE_SAVE)
            .setValue(SaveCommand.newBuilder().build().toByteString())
    }

    override fun restore() {
        currentFrame
            .addCommandsBuilder()
            .setTypeUrl(TYPE_RESTORE)
            .setValue(RestoreCommand.newBuilder().build().toByteString())
    }

    override fun restoreToCount(saveCount: Int) {
        currentFrame
            .addCommandsBuilder()
            .setTypeUrl(TYPE_RESTORE_TO_COUNT)
            .setValue(
                RestoreToCountCommand.newBuilder()
                    .setCount(saveCount)
                    .build().toByteString()
            )
    }

    override fun translate(dx: Float, dy: Float) {
        currentFrame
            .addCommandsBuilder()
            .setTypeUrl(TYPE_TRANSLATE)
            .setValue(
                TranslateCommand.newBuilder()
                    .setCoordinate(
                        CoordinateF.newBuilder()
                            .setX(dx)
                            .setY(dy)
                            .build()
                    )
                    .build().toByteString()
            )
    }

    override fun clipRect(rect: Rect) {
        currentFrame
            .addCommandsBuilder()
            .setTypeUrl(TYPE_CLIP_RECT)
            .setValue(
                ClipRectCommand.newBuilder()
                    .setRect(
                        ReplayOuterClass.Rect.newBuilder()
                            .setTop(rect.top)
                            .setLeft(rect.left)
                            .setRight(rect.right)
                            .setBottom(rect.bottom)
                            .build()
                    )
                    .build().toByteString()
            )
    }

    override fun clipRect(left: Int, top: Int, right: Int, bottom: Int) {
        currentFrame
            .addCommandsBuilder()
            .setTypeUrl(TYPE_CLIP_RECT)
            .setValue(
                ClipRectCommand.newBuilder()
                    .setRect(
                        ReplayOuterClass.Rect.newBuilder()
                            .setTop(top)
                            .setLeft(left)
                            .setRight(right)
                            .setBottom(bottom)
                            .build()
                    )
                    .build().toByteString()
            )
    }

    override fun clipRectF(left: Float, top: Float, right: Float, bottom: Float) {
        currentFrame
            .addCommandsBuilder()
            .setTypeUrl(TYPE_CLIP_RECTF)
            .setValue(
                ReplayOuterClass.ClipRectFCommand.newBuilder()
                    .setRect(
                        ReplayOuterClass.RectF.newBuilder()
                            .setTop(top)
                            .setLeft(left)
                            .setRight(right)
                            .setBottom(bottom)
                            .build()
                    )
                    .build().toByteString()
            )
    }

    override fun drawRoundRect(rect: RectF, rx: Float, ry: Float, paint: Paint) {
        currentFrame
            .addCommandsBuilder()
            .setTypeUrl(TYPE_DRAW_ROUND_RECT)
            .setValue(
                DrawRoundRectCommand.newBuilder()
                    .setRect(
                        ReplayOuterClass.RectF.newBuilder()
                            .setTop(rect.top)
                            .setLeft(rect.left)
                            .setRight(rect.right)
                            .setBottom(rect.bottom)
                            .build()
                    )
                    .setRadii(
                        CoordinateF.newBuilder()
                            .setX(rx)
                            .setY(ry)
                            .build()
                    )
                    .setPaint(paintToProto(paint))
                    .build().toByteString()
            )
    }

    override fun drawCircle(cx: Float, cy: Float, radius: Float, paint: Paint) {
        currentFrame
            .addCommandsBuilder()
            .setTypeUrl(TYPE_DRAW_CIRCLE)
            .setValue(
                DrawCircleCommand.newBuilder()
                    .setPosition(
                        CoordinateF.newBuilder()
                            .setX(cx)
                            .setY(cy)
                    )
                    .setRadius(radius)
                    .setPaint(paintToProto(paint))
                    .build().toByteString()
            )
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
        currentFrame
            .addCommandsBuilder()
            .setTypeUrl(TYPE_DRAW_TEXT)
            .setValue(
                DrawTextCommand.newBuilder()
                    .setText(txt)
                    .setPosition(
                        CoordinateF.newBuilder()
                            .setX(x)
                            .setY(y)
                    )
                    .setPaint(paintToProto(paint))
                    .build().toByteString()
            )
    }

    override fun drawRect(r: Rect, paint: Paint) {
        currentFrame
            .addCommandsBuilder()
            .setTypeUrl(TYPE_DRAW_RECT)
            .setValue(
                DrawRectCommand.newBuilder()
                    .setRect(
                        ReplayOuterClass.Rect.newBuilder()
                            .setTop(r.top)
                            .setLeft(r.left)
                            .setRight(r.right)
                            .setBottom(r.bottom)
                    )
                    .setPaint(paintToProto(paint))
                    .build().toByteString()
            )
    }

    override fun concat(matrix: Matrix) {
        currentFrame
            .addCommandsBuilder()
            .setTypeUrl(TYPE_CONCAT)
            .setValue(
                ConcatCommand.newBuilder().addAllMatrix(matrix.values().toList())
                    .build().toByteString()
            )
    }

}