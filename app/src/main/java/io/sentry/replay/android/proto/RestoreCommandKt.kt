// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: replay.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

package io.sentry.replay.android.proto;

@kotlin.jvm.JvmName("-initializerestoreCommand")
public inline fun restoreCommand(block: io.sentry.replay.android.proto.RestoreCommandKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.RestoreCommand =
    io.sentry.replay.android.proto.RestoreCommandKt.Dsl._create(io.sentry.replay.android.proto.ReplayOuterClass.RestoreCommand.newBuilder())
        .apply { block() }._build()

/**
 * Protobuf type `io.sentry.replay.android.proto.RestoreCommand`
 */
public object RestoreCommandKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: io.sentry.replay.android.proto.ReplayOuterClass.RestoreCommand.Builder
    ) {
        public companion object {
            @kotlin.jvm.JvmSynthetic
            @kotlin.PublishedApi
            internal fun _create(builder: io.sentry.replay.android.proto.ReplayOuterClass.RestoreCommand.Builder): Dsl =
                Dsl(builder)
        }

        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _build(): io.sentry.replay.android.proto.ReplayOuterClass.RestoreCommand =
            _builder.build()
    }
}

@kotlin.jvm.JvmSynthetic
public inline fun io.sentry.replay.android.proto.ReplayOuterClass.RestoreCommand.copy(block: io.sentry.replay.android.proto.RestoreCommandKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.RestoreCommand =
    io.sentry.replay.android.proto.RestoreCommandKt.Dsl._create(this.toBuilder()).apply { block() }
        ._build()

