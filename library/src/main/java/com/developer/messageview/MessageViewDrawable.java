package com.developer.messageview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
<<<<<<< HEAD
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
=======
import androidx.annotation.NonNull;
>>>>>>> 9592bda02243d1fc8ebeff6842937c9cd057b72d

public class MessageViewDrawable extends Drawable {
    private final Paint paint;
    private final RectF rectF;
    private final Rect rect;
    private float radius;
    private float padding;
    private boolean InsetForPadding;
    private boolean InsetForRadius = true;

    MessageViewDrawable(int backgroundColor, float radius) {
        this.radius = radius;
        paint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        paint.setColor(backgroundColor);
        rectF = new RectF();
        rect = new Rect();
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        canvas.drawRoundRect(rectF, radius, radius, paint);
    }

    @Override
    protected void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        updateBounds(bounds);
    }

<<<<<<< HEAD
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
=======
>>>>>>> 9592bda02243d1fc8ebeff6842937c9cd057b72d
    @Override
    public void getOutline(@NonNull Outline outline) {
        outline.setRoundRect(rect, radius);
    }

    @Override
    public void setAlpha(int alpha) {
        // not supported because older versions do not support
    }

    @Override
    public void setColorFilter(ColorFilter cf) {
        // not supported because older versions do not support
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }

    private void updateBounds(Rect bounds) {
        if (bounds == null) {
            bounds = getBounds();
        }
        rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        rect.set(bounds);
    }

    void setColor(int color) {
        paint.setColor(color);
        invalidateSelf();
    }

    public float getRadius() {
        return radius;
    }

    void setRadius(float radius) {
        if (radius == this.radius) {
            return;
        }
        this.radius = radius;
        updateBounds(null);
        invalidateSelf();
    }

    public Paint getPaint() {
        return paint;
    }

    void setPadding(float padding, boolean insetForPadding, boolean insetForRadius) {
        if (padding == this.padding && InsetForPadding == insetForPadding &&
                InsetForRadius == insetForRadius) {
            return;
        }
        this.padding = padding;
        InsetForPadding = insetForPadding;
        InsetForRadius = insetForRadius;
        updateBounds(null);
        invalidateSelf();
    }

    float getPadding() {
        return padding;
    }
}