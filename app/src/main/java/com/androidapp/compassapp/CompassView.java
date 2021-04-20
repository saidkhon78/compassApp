package com.androidapp.compassapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.jar.Attributes;

public class CompassView extends View {
    Bitmap bitmap;

    public CompassView(Context context, @Nullable Attributes attrs) {
        super(context, (AttributeSet) attrs);
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.compass);
    }
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        int cx = getWidth()/2;
        int cy = getHeight()/2;

        int x0 = cx - bitmap.getWidth()/2;
        int y0 = cy - bitmap.getHeight()/2;

        canvas.drawBitmap(bitmap, x0, y0,null);
    }
}
