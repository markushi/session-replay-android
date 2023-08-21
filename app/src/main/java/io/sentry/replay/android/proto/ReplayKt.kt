// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: replay.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

package io.sentry.replay.android.proto;

@kotlin.jvm.JvmName("-initializereplay")
public inline fun replay(block: io.sentry.replay.android.proto.ReplayKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.Replay =
    io.sentry.replay.android.proto.ReplayKt.Dsl._create(io.sentry.replay.android.proto.ReplayOuterClass.Replay.newBuilder())
        .apply { block() }._build()

/**
 * Protobuf type `io.sentry.replay.android.proto.Replay`
 */
public object ReplayKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: io.sentry.replay.android.proto.ReplayOuterClass.Replay.Builder
    ) {
        public companion object {
            @kotlin.jvm.JvmSynthetic
            @kotlin.PublishedApi
            internal fun _create(builder: io.sentry.replay.android.proto.ReplayOuterClass.Replay.Builder): Dsl =
                Dsl(builder)
        }

        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _build(): io.sentry.replay.android.proto.ReplayOuterClass.Replay =
            _builder.build()

        /**
         * `string id = 1;`
         */
        public var id: kotlin.String
            @JvmName("getId")
            get() = _builder.getId()
            @JvmName("setId")
            set(value) {
                _builder.setId(value)
            }

        /**
         * `string id = 1;`
         */
        public fun clearId() {
            _builder.clearId()
        }

        /**
         * An uninstantiable, behaviorless type to represent the field in
         * generics.
         */
        @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
        public class FramesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()

        /**
         * `repeated .io.sentry.replay.android.proto.Frame frames = 2;`
         */
        public val frames: com.google.protobuf.kotlin.DslList<io.sentry.replay.android.proto.ReplayOuterClass.Frame, FramesProxy>
            @kotlin.jvm.JvmSynthetic
            get() = com.google.protobuf.kotlin.DslList(
                _builder.getFramesList()
            )

        /**
         * `repeated .io.sentry.replay.android.proto.Frame frames = 2;`
         * @param value The frames to add.
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("addFrames")
        public fun com.google.protobuf.kotlin.DslList<io.sentry.replay.android.proto.ReplayOuterClass.Frame, FramesProxy>.add(
            value: io.sentry.replay.android.proto.ReplayOuterClass.Frame
        ) {
            _builder.addFrames(value)
        }

        /**
         * `repeated .io.sentry.replay.android.proto.Frame frames = 2;`
         * @param value The frames to add.
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("plusAssignFrames")
        @Suppress("NOTHING_TO_INLINE")
        public inline operator fun com.google.protobuf.kotlin.DslList<io.sentry.replay.android.proto.ReplayOuterClass.Frame, FramesProxy>.plusAssign(
            value: io.sentry.replay.android.proto.ReplayOuterClass.Frame
        ) {
            add(value)
        }

        /**
         * `repeated .io.sentry.replay.android.proto.Frame frames = 2;`
         * @param values The frames to add.
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("addAllFrames")
        public fun com.google.protobuf.kotlin.DslList<io.sentry.replay.android.proto.ReplayOuterClass.Frame, FramesProxy>.addAll(
            values: kotlin.collections.Iterable<io.sentry.replay.android.proto.ReplayOuterClass.Frame>
        ) {
            _builder.addAllFrames(values)
        }

        /**
         * `repeated .io.sentry.replay.android.proto.Frame frames = 2;`
         * @param values The frames to add.
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("plusAssignAllFrames")
        @Suppress("NOTHING_TO_INLINE")
        public inline operator fun com.google.protobuf.kotlin.DslList<io.sentry.replay.android.proto.ReplayOuterClass.Frame, FramesProxy>.plusAssign(
            values: kotlin.collections.Iterable<io.sentry.replay.android.proto.ReplayOuterClass.Frame>
        ) {
            addAll(values)
        }

        /**
         * `repeated .io.sentry.replay.android.proto.Frame frames = 2;`
         * @param index The index to set the value at.
         * @param value The frames to set.
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("setFrames")
        public operator fun com.google.protobuf.kotlin.DslList<io.sentry.replay.android.proto.ReplayOuterClass.Frame, FramesProxy>.set(
            index: kotlin.Int,
            value: io.sentry.replay.android.proto.ReplayOuterClass.Frame
        ) {
            _builder.setFrames(index, value)
        }

        /**
         * `repeated .io.sentry.replay.android.proto.Frame frames = 2;`
         */
        @kotlin.jvm.JvmSynthetic
        @kotlin.jvm.JvmName("clearFrames")
        public fun com.google.protobuf.kotlin.DslList<io.sentry.replay.android.proto.ReplayOuterClass.Frame, FramesProxy>.clear() {
            _builder.clearFrames()
        }

    }
}

@kotlin.jvm.JvmSynthetic
public inline fun io.sentry.replay.android.proto.ReplayOuterClass.Replay.copy(block: io.sentry.replay.android.proto.ReplayKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.Replay =
    io.sentry.replay.android.proto.ReplayKt.Dsl._create(this.toBuilder()).apply { block() }._build()

