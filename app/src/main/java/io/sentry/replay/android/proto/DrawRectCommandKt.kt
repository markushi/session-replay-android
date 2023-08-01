// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: replay.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package io.sentry.replay.android.proto;

@kotlin.jvm.JvmName("-initializedrawRectCommand")
public inline fun drawRectCommand(block: io.sentry.replay.android.proto.DrawRectCommandKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.DrawRectCommand =
  io.sentry.replay.android.proto.DrawRectCommandKt.Dsl._create(io.sentry.replay.android.proto.ReplayOuterClass.DrawRectCommand.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `io.sentry.replay.android.proto.DrawRectCommand`
 */
public object DrawRectCommandKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.sentry.replay.android.proto.ReplayOuterClass.DrawRectCommand.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.sentry.replay.android.proto.ReplayOuterClass.DrawRectCommand.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.sentry.replay.android.proto.ReplayOuterClass.DrawRectCommand = _builder.build()

    /**
     * `.io.sentry.replay.android.proto.Rect rect = 1;`
     */
    public var rect: io.sentry.replay.android.proto.ReplayOuterClass.Rect
      @JvmName("getRect")
      get() = _builder.getRect()
      @JvmName("setRect")
      set(value) {
        _builder.setRect(value)
      }
    /**
     * `.io.sentry.replay.android.proto.Rect rect = 1;`
     */
    public fun clearRect() {
      _builder.clearRect()
    }
    /**
     * `.io.sentry.replay.android.proto.Rect rect = 1;`
     * @return Whether the rect field is set.
     */
    public fun hasRect(): kotlin.Boolean {
      return _builder.hasRect()
    }

    /**
     * `.io.sentry.replay.android.proto.Paint paint = 2;`
     */
    public var paint: io.sentry.replay.android.proto.ReplayOuterClass.Paint
      @JvmName("getPaint")
      get() = _builder.getPaint()
      @JvmName("setPaint")
      set(value) {
        _builder.setPaint(value)
      }
    /**
     * `.io.sentry.replay.android.proto.Paint paint = 2;`
     */
    public fun clearPaint() {
      _builder.clearPaint()
    }
    /**
     * `.io.sentry.replay.android.proto.Paint paint = 2;`
     * @return Whether the paint field is set.
     */
    public fun hasPaint(): kotlin.Boolean {
      return _builder.hasPaint()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.sentry.replay.android.proto.ReplayOuterClass.DrawRectCommand.copy(block: io.sentry.replay.android.proto.DrawRectCommandKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.DrawRectCommand =
  io.sentry.replay.android.proto.DrawRectCommandKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawRectCommandOrBuilder.rectOrNull: io.sentry.replay.android.proto.ReplayOuterClass.Rect?
  get() = if (hasRect()) getRect() else null

public val io.sentry.replay.android.proto.ReplayOuterClass.DrawRectCommandOrBuilder.paintOrNull: io.sentry.replay.android.proto.ReplayOuterClass.Paint?
  get() = if (hasPaint()) getPaint() else null

