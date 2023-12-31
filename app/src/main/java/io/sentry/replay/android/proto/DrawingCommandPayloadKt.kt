// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: replay.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

package io.sentry.replay.android.proto;

@kotlin.jvm.JvmName("-initializedrawingCommandPayload")
public inline fun drawingCommandPayload(block: io.sentry.replay.android.proto.DrawingCommandPayloadKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayload =
    io.sentry.replay.android.proto.DrawingCommandPayloadKt.Dsl._create(io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayload.newBuilder())
        .apply { block() }._build()

/**
 * Protobuf type `io.sentry.replay.android.proto.DrawingCommandPayload`
 */
public object DrawingCommandPayloadKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayload.Builder
    ) {
        public companion object {
            @kotlin.jvm.JvmSynthetic
            @kotlin.PublishedApi
            internal fun _create(builder: io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayload.Builder): Dsl =
                Dsl(builder)
        }

        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _build(): io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayload =
            _builder.build()

        /**
         * `.io.sentry.replay.android.proto.SaveCommand save = 2;`
         */
        public var save: io.sentry.replay.android.proto.ReplayOuterClass.SaveCommand
            @JvmName("getSave")
            get() = _builder.getSave()
            @JvmName("setSave")
            set(value) {
                _builder.setSave(value)
            }

        /**
         * `.io.sentry.replay.android.proto.SaveCommand save = 2;`
         */
        public fun clearSave() {
            _builder.clearSave()
        }

        /**
         * `.io.sentry.replay.android.proto.SaveCommand save = 2;`
         * @return Whether the save field is set.
         */
        public fun hasSave(): kotlin.Boolean {
            return _builder.hasSave()
        }

        /**
         * `.io.sentry.replay.android.proto.RestoreCommand restore = 3;`
         */
        public var restore: io.sentry.replay.android.proto.ReplayOuterClass.RestoreCommand
            @JvmName("getRestore")
            get() = _builder.getRestore()
            @JvmName("setRestore")
            set(value) {
                _builder.setRestore(value)
            }

        /**
         * `.io.sentry.replay.android.proto.RestoreCommand restore = 3;`
         */
        public fun clearRestore() {
            _builder.clearRestore()
        }

        /**
         * `.io.sentry.replay.android.proto.RestoreCommand restore = 3;`
         * @return Whether the restore field is set.
         */
        public fun hasRestore(): kotlin.Boolean {
            return _builder.hasRestore()
        }

        /**
         * `.io.sentry.replay.android.proto.RestoreToCountCommand restoreToCount = 4;`
         */
        public var restoreToCount: io.sentry.replay.android.proto.ReplayOuterClass.RestoreToCountCommand
            @JvmName("getRestoreToCount")
            get() = _builder.getRestoreToCount()
            @JvmName("setRestoreToCount")
            set(value) {
                _builder.setRestoreToCount(value)
            }

        /**
         * `.io.sentry.replay.android.proto.RestoreToCountCommand restoreToCount = 4;`
         */
        public fun clearRestoreToCount() {
            _builder.clearRestoreToCount()
        }

        /**
         * `.io.sentry.replay.android.proto.RestoreToCountCommand restoreToCount = 4;`
         * @return Whether the restoreToCount field is set.
         */
        public fun hasRestoreToCount(): kotlin.Boolean {
            return _builder.hasRestoreToCount()
        }

        /**
         * `.io.sentry.replay.android.proto.TranslateCommand translate = 5;`
         */
        public var translate: io.sentry.replay.android.proto.ReplayOuterClass.TranslateCommand
            @JvmName("getTranslate")
            get() = _builder.getTranslate()
            @JvmName("setTranslate")
            set(value) {
                _builder.setTranslate(value)
            }

        /**
         * `.io.sentry.replay.android.proto.TranslateCommand translate = 5;`
         */
        public fun clearTranslate() {
            _builder.clearTranslate()
        }

        /**
         * `.io.sentry.replay.android.proto.TranslateCommand translate = 5;`
         * @return Whether the translate field is set.
         */
        public fun hasTranslate(): kotlin.Boolean {
            return _builder.hasTranslate()
        }

        /**
         * `.io.sentry.replay.android.proto.ClipRectFCommand clipRectF = 7;`
         */
        public var clipRectF: io.sentry.replay.android.proto.ReplayOuterClass.ClipRectFCommand
            @JvmName("getClipRectF")
            get() = _builder.getClipRectF()
            @JvmName("setClipRectF")
            set(value) {
                _builder.setClipRectF(value)
            }

        /**
         * `.io.sentry.replay.android.proto.ClipRectFCommand clipRectF = 7;`
         */
        public fun clearClipRectF() {
            _builder.clearClipRectF()
        }

        /**
         * `.io.sentry.replay.android.proto.ClipRectFCommand clipRectF = 7;`
         * @return Whether the clipRectF field is set.
         */
        public fun hasClipRectF(): kotlin.Boolean {
            return _builder.hasClipRectF()
        }

        /**
         * `.io.sentry.replay.android.proto.DrawTextCommand drawText = 8;`
         */
        public var drawText: io.sentry.replay.android.proto.ReplayOuterClass.DrawTextCommand
            @JvmName("getDrawText")
            get() = _builder.getDrawText()
            @JvmName("setDrawText")
            set(value) {
                _builder.setDrawText(value)
            }

        /**
         * `.io.sentry.replay.android.proto.DrawTextCommand drawText = 8;`
         */
        public fun clearDrawText() {
            _builder.clearDrawText()
        }

        /**
         * `.io.sentry.replay.android.proto.DrawTextCommand drawText = 8;`
         * @return Whether the drawText field is set.
         */
        public fun hasDrawText(): kotlin.Boolean {
            return _builder.hasDrawText()
        }

        /**
         * `.io.sentry.replay.android.proto.DrawRoundRectCommand drawRoundRect = 9;`
         */
        public var drawRoundRect: io.sentry.replay.android.proto.ReplayOuterClass.DrawRoundRectCommand
            @JvmName("getDrawRoundRect")
            get() = _builder.getDrawRoundRect()
            @JvmName("setDrawRoundRect")
            set(value) {
                _builder.setDrawRoundRect(value)
            }

        /**
         * `.io.sentry.replay.android.proto.DrawRoundRectCommand drawRoundRect = 9;`
         */
        public fun clearDrawRoundRect() {
            _builder.clearDrawRoundRect()
        }

        /**
         * `.io.sentry.replay.android.proto.DrawRoundRectCommand drawRoundRect = 9;`
         * @return Whether the drawRoundRect field is set.
         */
        public fun hasDrawRoundRect(): kotlin.Boolean {
            return _builder.hasDrawRoundRect()
        }

        /**
         * `.io.sentry.replay.android.proto.DrawRectCommand drawRect = 10;`
         */
        public var drawRect: io.sentry.replay.android.proto.ReplayOuterClass.DrawRectCommand
            @JvmName("getDrawRect")
            get() = _builder.getDrawRect()
            @JvmName("setDrawRect")
            set(value) {
                _builder.setDrawRect(value)
            }

        /**
         * `.io.sentry.replay.android.proto.DrawRectCommand drawRect = 10;`
         */
        public fun clearDrawRect() {
            _builder.clearDrawRect()
        }

        /**
         * `.io.sentry.replay.android.proto.DrawRectCommand drawRect = 10;`
         * @return Whether the drawRect field is set.
         */
        public fun hasDrawRect(): kotlin.Boolean {
            return _builder.hasDrawRect()
        }

        /**
         * `.io.sentry.replay.android.proto.ConcatCommand concat = 11;`
         */
        public var concat: io.sentry.replay.android.proto.ReplayOuterClass.ConcatCommand
            @JvmName("getConcat")
            get() = _builder.getConcat()
            @JvmName("setConcat")
            set(value) {
                _builder.setConcat(value)
            }

        /**
         * `.io.sentry.replay.android.proto.ConcatCommand concat = 11;`
         */
        public fun clearConcat() {
            _builder.clearConcat()
        }

        /**
         * `.io.sentry.replay.android.proto.ConcatCommand concat = 11;`
         * @return Whether the concat field is set.
         */
        public fun hasConcat(): kotlin.Boolean {
            return _builder.hasConcat()
        }

        /**
         * `.io.sentry.replay.android.proto.DrawCircleCommand drawCircle = 12;`
         */
        public var drawCircle: io.sentry.replay.android.proto.ReplayOuterClass.DrawCircleCommand
            @JvmName("getDrawCircle")
            get() = _builder.getDrawCircle()
            @JvmName("setDrawCircle")
            set(value) {
                _builder.setDrawCircle(value)
            }

        /**
         * `.io.sentry.replay.android.proto.DrawCircleCommand drawCircle = 12;`
         */
        public fun clearDrawCircle() {
            _builder.clearDrawCircle()
        }

        /**
         * `.io.sentry.replay.android.proto.DrawCircleCommand drawCircle = 12;`
         * @return Whether the drawCircle field is set.
         */
        public fun hasDrawCircle(): kotlin.Boolean {
            return _builder.hasDrawCircle()
        }

        /**
         * `.io.sentry.replay.android.proto.RotateCommand rotate = 13;`
         */
        public var rotate: io.sentry.replay.android.proto.ReplayOuterClass.RotateCommand
            @JvmName("getRotate")
            get() = _builder.getRotate()
            @JvmName("setRotate")
            set(value) {
                _builder.setRotate(value)
            }

        /**
         * `.io.sentry.replay.android.proto.RotateCommand rotate = 13;`
         */
        public fun clearRotate() {
            _builder.clearRotate()
        }

        /**
         * `.io.sentry.replay.android.proto.RotateCommand rotate = 13;`
         * @return Whether the rotate field is set.
         */
        public fun hasRotate(): kotlin.Boolean {
            return _builder.hasRotate()
        }

        /**
         * `.io.sentry.replay.android.proto.SkewCommand skew = 14;`
         */
        public var skew: io.sentry.replay.android.proto.ReplayOuterClass.SkewCommand
            @JvmName("getSkew")
            get() = _builder.getSkew()
            @JvmName("setSkew")
            set(value) {
                _builder.setSkew(value)
            }

        /**
         * `.io.sentry.replay.android.proto.SkewCommand skew = 14;`
         */
        public fun clearSkew() {
            _builder.clearSkew()
        }

        /**
         * `.io.sentry.replay.android.proto.SkewCommand skew = 14;`
         * @return Whether the skew field is set.
         */
        public fun hasSkew(): kotlin.Boolean {
            return _builder.hasSkew()
        }

        /**
         * `.io.sentry.replay.android.proto.ScaleCommand scale = 15;`
         */
        public var scale: io.sentry.replay.android.proto.ReplayOuterClass.ScaleCommand
            @JvmName("getScale")
            get() = _builder.getScale()
            @JvmName("setScale")
            set(value) {
                _builder.setScale(value)
            }

        /**
         * `.io.sentry.replay.android.proto.ScaleCommand scale = 15;`
         */
        public fun clearScale() {
            _builder.clearScale()
        }

        /**
         * `.io.sentry.replay.android.proto.ScaleCommand scale = 15;`
         * @return Whether the scale field is set.
         */
        public fun hasScale(): kotlin.Boolean {
            return _builder.hasScale()
        }

        /**
         * `.io.sentry.replay.android.proto.SetMatrixCommand setMatrix = 16;`
         */
        public var setMatrix: io.sentry.replay.android.proto.ReplayOuterClass.SetMatrixCommand
            @JvmName("getSetMatrix")
            get() = _builder.getSetMatrix()
            @JvmName("setSetMatrix")
            set(value) {
                _builder.setSetMatrix(value)
            }

        /**
         * `.io.sentry.replay.android.proto.SetMatrixCommand setMatrix = 16;`
         */
        public fun clearSetMatrix() {
            _builder.clearSetMatrix()
        }

        /**
         * `.io.sentry.replay.android.proto.SetMatrixCommand setMatrix = 16;`
         * @return Whether the setMatrix field is set.
         */
        public fun hasSetMatrix(): kotlin.Boolean {
            return _builder.hasSetMatrix()
        }

        public val payloadCase: io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayload.PayloadCase
            @JvmName("getPayloadCase")
            get() = _builder.getPayloadCase()

        public fun clearPayload() {
            _builder.clearPayload()
        }
    }
}

@kotlin.jvm.JvmSynthetic
public inline fun io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayload.copy(block: io.sentry.replay.android.proto.DrawingCommandPayloadKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayload =
    io.sentry.replay.android.proto.DrawingCommandPayloadKt.Dsl._create(this.toBuilder())
        .apply { block() }._build()

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayloadOrBuilder.saveOrNull: io.sentry.replay.android.proto.ReplayOuterClass.SaveCommand?
    get() = if (hasSave()) getSave() else null

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayloadOrBuilder.restoreOrNull: io.sentry.replay.android.proto.ReplayOuterClass.RestoreCommand?
    get() = if (hasRestore()) getRestore() else null

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayloadOrBuilder.restoreToCountOrNull: io.sentry.replay.android.proto.ReplayOuterClass.RestoreToCountCommand?
    get() = if (hasRestoreToCount()) getRestoreToCount() else null

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayloadOrBuilder.translateOrNull: io.sentry.replay.android.proto.ReplayOuterClass.TranslateCommand?
    get() = if (hasTranslate()) getTranslate() else null

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayloadOrBuilder.clipRectFOrNull: io.sentry.replay.android.proto.ReplayOuterClass.ClipRectFCommand?
    get() = if (hasClipRectF()) getClipRectF() else null

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayloadOrBuilder.drawTextOrNull: io.sentry.replay.android.proto.ReplayOuterClass.DrawTextCommand?
    get() = if (hasDrawText()) getDrawText() else null

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayloadOrBuilder.drawRoundRectOrNull: io.sentry.replay.android.proto.ReplayOuterClass.DrawRoundRectCommand?
    get() = if (hasDrawRoundRect()) getDrawRoundRect() else null

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayloadOrBuilder.drawRectOrNull: io.sentry.replay.android.proto.ReplayOuterClass.DrawRectCommand?
    get() = if (hasDrawRect()) getDrawRect() else null

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayloadOrBuilder.concatOrNull: io.sentry.replay.android.proto.ReplayOuterClass.ConcatCommand?
    get() = if (hasConcat()) getConcat() else null

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayloadOrBuilder.drawCircleOrNull: io.sentry.replay.android.proto.ReplayOuterClass.DrawCircleCommand?
    get() = if (hasDrawCircle()) getDrawCircle() else null

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayloadOrBuilder.rotateOrNull: io.sentry.replay.android.proto.ReplayOuterClass.RotateCommand?
    get() = if (hasRotate()) getRotate() else null

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayloadOrBuilder.skewOrNull: io.sentry.replay.android.proto.ReplayOuterClass.SkewCommand?
    get() = if (hasSkew()) getSkew() else null

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayloadOrBuilder.scaleOrNull: io.sentry.replay.android.proto.ReplayOuterClass.ScaleCommand?
    get() = if (hasScale()) getScale() else null

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayloadOrBuilder.setMatrixOrNull: io.sentry.replay.android.proto.ReplayOuterClass.SetMatrixCommand?
    get() = if (hasSetMatrix()) getSetMatrix() else null

