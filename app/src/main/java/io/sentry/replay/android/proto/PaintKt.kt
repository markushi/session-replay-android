// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: replay.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package io.sentry.replay.android.proto;

@kotlin.jvm.JvmName("-initializepaint")
public inline fun paint(block: io.sentry.replay.android.proto.PaintKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.Paint =
  io.sentry.replay.android.proto.PaintKt.Dsl._create(io.sentry.replay.android.proto.ReplayOuterClass.Paint.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `io.sentry.replay.android.proto.Paint`
 */
public object PaintKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: io.sentry.replay.android.proto.ReplayOuterClass.Paint.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: io.sentry.replay.android.proto.ReplayOuterClass.Paint.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): io.sentry.replay.android.proto.ReplayOuterClass.Paint = _builder.build()

    /**
     * `.io.sentry.replay.android.proto.PaintStyle style = 1;`
     */
    public var style: io.sentry.replay.android.proto.ReplayOuterClass.PaintStyle
      @JvmName("getStyle")
      get() = _builder.getStyle()
      @JvmName("setStyle")
      set(value) {
        _builder.setStyle(value)
      }
    public var styleValue: kotlin.Int
      @JvmName("getStyleValue")
      get() = _builder.getStyleValue()
      @JvmName("setStyleValue")
      set(value) {
        _builder.setStyleValue(value)
      }
    /**
     * `.io.sentry.replay.android.proto.PaintStyle style = 1;`
     */
    public fun clearStyle() {
      _builder.clearStyle()
    }

    /**
     * `.io.sentry.replay.android.proto.TextAlign textAlign = 2;`
     */
    public var textAlign: io.sentry.replay.android.proto.ReplayOuterClass.TextAlign
      @JvmName("getTextAlign")
      get() = _builder.getTextAlign()
      @JvmName("setTextAlign")
      set(value) {
        _builder.setTextAlign(value)
      }
    public var textAlignValue: kotlin.Int
      @JvmName("getTextAlignValue")
      get() = _builder.getTextAlignValue()
      @JvmName("setTextAlignValue")
      set(value) {
        _builder.setTextAlignValue(value)
      }
    /**
     * `.io.sentry.replay.android.proto.TextAlign textAlign = 2;`
     */
    public fun clearTextAlign() {
      _builder.clearTextAlign()
    }

    /**
     * `int32 color = 3;`
     */
    public var color: kotlin.Int
      @JvmName("getColor")
      get() = _builder.getColor()
      @JvmName("setColor")
      set(value) {
        _builder.setColor(value)
      }
    /**
     * `int32 color = 3;`
     */
    public fun clearColor() {
      _builder.clearColor()
    }

    /**
     * `float alpha = 8;`
     */
    public var alpha: kotlin.Float
      @JvmName("getAlpha")
      get() = _builder.getAlpha()
      @JvmName("setAlpha")
      set(value) {
        _builder.setAlpha(value)
      }
    /**
     * `float alpha = 8;`
     */
    public fun clearAlpha() {
      _builder.clearAlpha()
    }

    /**
     * `float strokeWidth = 4;`
     */
    public var strokeWidth: kotlin.Float
      @JvmName("getStrokeWidth")
      get() = _builder.getStrokeWidth()
      @JvmName("setStrokeWidth")
      set(value) {
        _builder.setStrokeWidth(value)
      }
    /**
     * `float strokeWidth = 4;`
     */
    public fun clearStrokeWidth() {
      _builder.clearStrokeWidth()
    }

    /**
     * `float textSize = 5;`
     */
    public var textSize: kotlin.Float
      @JvmName("getTextSize")
      get() = _builder.getTextSize()
      @JvmName("setTextSize")
      set(value) {
        _builder.setTextSize(value)
      }
    /**
     * `float textSize = 5;`
     */
    public fun clearTextSize() {
      _builder.clearTextSize()
    }

    /**
     * `optional .io.sentry.replay.android.proto.PorterDuffColorFilter porterDuffColorFilter = 6;`
     */
    public var porterDuffColorFilter: io.sentry.replay.android.proto.ReplayOuterClass.PorterDuffColorFilter
      @JvmName("getPorterDuffColorFilter")
      get() = _builder.getPorterDuffColorFilter()
      @JvmName("setPorterDuffColorFilter")
      set(value) {
        _builder.setPorterDuffColorFilter(value)
      }
    /**
     * `optional .io.sentry.replay.android.proto.PorterDuffColorFilter porterDuffColorFilter = 6;`
     */
    public fun clearPorterDuffColorFilter() {
      _builder.clearPorterDuffColorFilter()
    }
    /**
     * `optional .io.sentry.replay.android.proto.PorterDuffColorFilter porterDuffColorFilter = 6;`
     * @return Whether the porterDuffColorFilter field is set.
     */
    public fun hasPorterDuffColorFilter(): kotlin.Boolean {
      return _builder.hasPorterDuffColorFilter()
    }
    public val PaintKt.Dsl.porterDuffColorFilterOrNull: io.sentry.replay.android.proto.ReplayOuterClass.PorterDuffColorFilter?
      get() = _builder.porterDuffColorFilterOrNull

    /**
     * `optional .io.sentry.replay.android.proto.BlendMode blendMode = 7;`
     */
    public var blendMode: io.sentry.replay.android.proto.ReplayOuterClass.BlendMode
      @JvmName("getBlendMode")
      get() = _builder.getBlendMode()
      @JvmName("setBlendMode")
      set(value) {
        _builder.setBlendMode(value)
      }
    public var blendModeValue: kotlin.Int
      @JvmName("getBlendModeValue")
      get() = _builder.getBlendModeValue()
      @JvmName("setBlendModeValue")
      set(value) {
        _builder.setBlendModeValue(value)
      }
    /**
     * `optional .io.sentry.replay.android.proto.BlendMode blendMode = 7;`
     */
    public fun clearBlendMode() {
      _builder.clearBlendMode()
    }
    /**
     * `optional .io.sentry.replay.android.proto.BlendMode blendMode = 7;`
     * @return Whether the blendMode field is set.
     */
    public fun hasBlendMode(): kotlin.Boolean {
      return _builder.hasBlendMode()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun io.sentry.replay.android.proto.ReplayOuterClass.Paint.copy(block: io.sentry.replay.android.proto.PaintKt.Dsl.() -> kotlin.Unit): io.sentry.replay.android.proto.ReplayOuterClass.Paint =
  io.sentry.replay.android.proto.PaintKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val io.sentry.replay.android.proto.ReplayOuterClass.PaintOrBuilder.porterDuffColorFilterOrNull: io.sentry.replay.android.proto.ReplayOuterClass.PorterDuffColorFilter?
  get() = if (hasPorterDuffColorFilter()) getPorterDuffColorFilter() else null

