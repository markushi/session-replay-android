// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: replay.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

package io.sentry.replay.android.proto;

@kotlin.jvm.JvmName("-initializedrawingCommand")
public inline fun drawingCommand(block: io.sentry.replay.android.proto.DrawingCommandKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommand =
    io.sentry.replay.android.proto.DrawingCommandKt.Dsl._create(io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommand.newBuilder())
        .apply { block() }._build()

/**
 * Protobuf type `io.sentry.replay.android.proto.DrawingCommand`
 */
public object DrawingCommandKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommand.Builder
    ) {
        public companion object {
            @kotlin.jvm.JvmSynthetic
            @kotlin.PublishedApi
            internal fun _create(builder: io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommand.Builder): Dsl =
                Dsl(builder)
        }

        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _build(): io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommand =
            _builder.build()

        /**
         * `.io.sentry.replay.android.proto.DrawingCommandPayload payload = 1;`
         */
        public var payload: io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayload
            @JvmName("getPayload")
            get() = _builder.getPayload()
            @JvmName("setPayload")
            set(value) {
                _builder.setPayload(value)
            }

        /**
         * `.io.sentry.replay.android.proto.DrawingCommandPayload payload = 1;`
         */
        public fun clearPayload() {
            _builder.clearPayload()
        }

        /**
         * `.io.sentry.replay.android.proto.DrawingCommandPayload payload = 1;`
         * @return Whether the payload field is set.
         */
        public fun hasPayload(): kotlin.Boolean {
            return _builder.hasPayload()
        }
    }
}

@kotlin.jvm.JvmSynthetic
public inline fun io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommand.copy(block: io.sentry.replay.android.proto.DrawingCommandKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommand =
    io.sentry.replay.android.proto.DrawingCommandKt.Dsl._create(this.toBuilder()).apply { block() }
        ._build()

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandOrBuilder.payloadOrNull: io.sentry.replay.android.proto.ReplayOuterClass.DrawingCommandPayload?
    get() = if (hasPayload()) getPayload() else null

