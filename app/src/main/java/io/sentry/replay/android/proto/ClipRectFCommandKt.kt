// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: replay.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package io.sentry.replay.android.proto;

@kotlin.jvm.JvmName("-initializeclipRectFCommand")
public inline fun clipRectFCommand(block: io.sentry.replay.android.proto.ClipRectFCommandKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.ClipRectFCommand =
  io.sentry.replay.android.proto.ClipRectFCommandKt.Dsl._create(io.sentry.replay.android.proto.ReplayOuterClass.ClipRectFCommand.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `io.sentry.replay.android.proto.ClipRectFCommand`
 */
public object ClipRectFCommandKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.sentry.replay.android.proto.ReplayOuterClass.ClipRectFCommand.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.sentry.replay.android.proto.ReplayOuterClass.ClipRectFCommand.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.sentry.replay.android.proto.ReplayOuterClass.ClipRectFCommand = _builder.build()

    /**
     * `.io.sentry.replay.android.proto.RectF rect = 1;`
     */
    public var rect: io.sentry.replay.android.proto.ReplayOuterClass.RectF
      @JvmName("getRect")
      get() = _builder.getRect()
      @JvmName("setRect")
      set(value) {
        _builder.setRect(value)
      }
    /**
     * `.io.sentry.replay.android.proto.RectF rect = 1;`
     */
    public fun clearRect() {
      _builder.clearRect()
    }
    /**
     * `.io.sentry.replay.android.proto.RectF rect = 1;`
     * @return Whether the rect field is set.
     */
    public fun hasRect(): kotlin.Boolean {
      return _builder.hasRect()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.sentry.replay.android.proto.ReplayOuterClass.ClipRectFCommand.copy(block: io.sentry.replay.android.proto.ClipRectFCommandKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.ClipRectFCommand =
  io.sentry.replay.android.proto.ClipRectFCommandKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val io.sentry.replay.android.proto.ReplayOuterClass.ClipRectFCommandOrBuilder.rectOrNull: io.sentry.replay.android.proto.ReplayOuterClass.RectF?
  get() = if (hasRect()) getRect() else null
