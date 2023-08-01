package io.sentry.replay.android.recorder

import android.graphics.Paint
import android.graphics.PorterDuff
import io.sentry.replay.android.PaintHelper
import io.sentry.replay.android.proto.ReplayOuterClass

fun modeToProto(mode: PorterDuff.Mode): ReplayOuterClass.PorterDuffMode = when (mode) {
    PorterDuff.Mode.CLEAR -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_CLEAR
    PorterDuff.Mode.SRC -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_SRC
    PorterDuff.Mode.DST -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_DST
    PorterDuff.Mode.SRC_OVER -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_SRC_OVER
    PorterDuff.Mode.DST_OVER -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_DST_OVER
    PorterDuff.Mode.SRC_IN -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_SRC_IN
    PorterDuff.Mode.DST_IN -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_DST_IN
    PorterDuff.Mode.SRC_OUT -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_SRC_OUT
    PorterDuff.Mode.DST_OUT -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_DST_OUT
    PorterDuff.Mode.SRC_ATOP -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_SRC_ATOP
    PorterDuff.Mode.DST_ATOP -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_DST_ATOP
    PorterDuff.Mode.XOR -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_XOR
    PorterDuff.Mode.DARKEN -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_DARKEN
    PorterDuff.Mode.LIGHTEN -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_LIGHTEN
    PorterDuff.Mode.MULTIPLY -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_MULTIPLY
    PorterDuff.Mode.SCREEN -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_SCREEN
    PorterDuff.Mode.ADD -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_ADD
    PorterDuff.Mode.OVERLAY -> ReplayOuterClass.PorterDuffMode.PORTER_DUFF_MODE_OVERLAY
}

fun paintToProto(paint: Paint): ReplayOuterClass.Paint {
    val builder = ReplayOuterClass.Paint.newBuilder()
    builder
        .setAlpha(paint.alpha / 255.0f)
        .setColor(paint.color)
        .setTextSize(paint.textSize)
        .setTextAlign(
            when (paint.textAlign) {
                Paint.Align.LEFT -> ReplayOuterClass.TextAlign.TEXT_ALIGN_LEFT
                Paint.Align.CENTER -> ReplayOuterClass.TextAlign.TEXT_ALIGN_CENTER
                Paint.Align.RIGHT -> ReplayOuterClass.TextAlign.TEXT_ALIGN_RIGHT
            }
        )
        .setStyle(
            when (paint.style) {
                Paint.Style.FILL -> ReplayOuterClass.PaintStyle.PAINT_STYLE_FILL
                Paint.Style.FILL_AND_STROKE -> ReplayOuterClass.PaintStyle.PAINT_STYLE_FILL_AND_STROKE
                Paint.Style.STROKE -> ReplayOuterClass.PaintStyle.PAINT_STYLE_STROKE
            }
        )

    paint.colorFilter?.let { colorFilter ->
        if (colorFilter is android.graphics.PorterDuffColorFilter) {
            PaintHelper.decodePorterDuffcolorFilter(colorFilter)?.let { colorAndMode ->
                builder.setPorterDuffColorFilter(
                    ReplayOuterClass.PorterDuffColorFilter.newBuilder()
                        .setColor(colorAndMode.first)
                        .setMode(modeToProto(colorAndMode.second))
                        .build()
                )
            }
        } else {
            // TODO implement
        }
    }

    return builder.build()
}