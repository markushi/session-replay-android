// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: replay.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

package io.sentry.replay.android.proto;

@kotlin.jvm.JvmName("-initializerect")
public inline fun rect(block: io.sentry.replay.android.proto.RectKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.Rect =
    io.sentry.replay.android.proto.RectKt.Dsl._create(io.sentry.replay.android.proto.ReplayOuterClass.Rect.newBuilder())
        .apply { block() }._build()

/**
 * Protobuf type `io.sentry.replay.android.proto.Rect`
 */
public object RectKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: io.sentry.replay.android.proto.ReplayOuterClass.Rect.Builder
    ) {
        public companion object {
            @kotlin.jvm.JvmSynthetic
            @kotlin.PublishedApi
            internal fun _create(builder: io.sentry.replay.android.proto.ReplayOuterClass.Rect.Builder): Dsl =
                Dsl(builder)
        }

        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _build(): io.sentry.replay.android.proto.ReplayOuterClass.Rect =
            _builder.build()

        /**
         * `int32 left = 1;`
         */
        public var left: kotlin.Int
            @JvmName("getLeft")
            get() = _builder.getLeft()
            @JvmName("setLeft")
            set(value) {
                _builder.setLeft(value)
            }

        /**
         * `int32 left = 1;`
         */
        public fun clearLeft() {
            _builder.clearLeft()
        }

        /**
         * `int32 right = 2;`
         */
        public var right: kotlin.Int
            @JvmName("getRight")
            get() = _builder.getRight()
            @JvmName("setRight")
            set(value) {
                _builder.setRight(value)
            }

        /**
         * `int32 right = 2;`
         */
        public fun clearRight() {
            _builder.clearRight()
        }

        /**
         * `int32 top = 3;`
         */
        public var top: kotlin.Int
            @JvmName("getTop")
            get() = _builder.getTop()
            @JvmName("setTop")
            set(value) {
                _builder.setTop(value)
            }

        /**
         * `int32 top = 3;`
         */
        public fun clearTop() {
            _builder.clearTop()
        }

        /**
         * `int32 bottom = 4;`
         */
        public var bottom: kotlin.Int
            @JvmName("getBottom")
            get() = _builder.getBottom()
            @JvmName("setBottom")
            set(value) {
                _builder.setBottom(value)
            }

        /**
         * `int32 bottom = 4;`
         */
        public fun clearBottom() {
            _builder.clearBottom()
        }
    }
}

@kotlin.jvm.JvmSynthetic
public inline fun io.sentry.replay.android.proto.ReplayOuterClass.Rect.copy(block: io.sentry.replay.android.proto.RectKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.Rect =
    io.sentry.replay.android.proto.RectKt.Dsl._create(this.toBuilder()).apply { block() }._build()

