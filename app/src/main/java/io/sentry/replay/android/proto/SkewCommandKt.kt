// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: replay.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package io.sentry.replay.android.proto;

@kotlin.jvm.JvmName("-initializeskewCommand")
public inline fun skewCommand(block: io.sentry.replay.android.proto.SkewCommandKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.SkewCommand =
  io.sentry.replay.android.proto.SkewCommandKt.Dsl._create(io.sentry.replay.android.proto.ReplayOuterClass.SkewCommand.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `io.sentry.replay.android.proto.SkewCommand`
 */
public object SkewCommandKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.sentry.replay.android.proto.ReplayOuterClass.SkewCommand.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.sentry.replay.android.proto.ReplayOuterClass.SkewCommand.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.sentry.replay.android.proto.ReplayOuterClass.SkewCommand = _builder.build()

    /**
     * `float sx = 1;`
     */
    public var sx: kotlin.Float
      @JvmName("getSx")
      get() = _builder.getSx()
      @JvmName("setSx")
      set(value) {
        _builder.setSx(value)
      }
    /**
     * `float sx = 1;`
     */
    public fun clearSx() {
      _builder.clearSx()
    }

    /**
     * `float sy = 2;`
     */
    public var sy: kotlin.Float
      @JvmName("getSy")
      get() = _builder.getSy()
      @JvmName("setSy")
      set(value) {
        _builder.setSy(value)
      }
    /**
     * `float sy = 2;`
     */
    public fun clearSy() {
      _builder.clearSy()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.sentry.replay.android.proto.ReplayOuterClass.SkewCommand.copy(block: io.sentry.replay.android.proto.SkewCommandKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.SkewCommand =
  io.sentry.replay.android.proto.SkewCommandKt.Dsl._create(this.toBuilder()).apply { block() }._build()

