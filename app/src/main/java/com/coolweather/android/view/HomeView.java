package com.coolweather.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class HomeView extends View {

    private Paint mPathPaint;
    private Path mPath;

    public HomeView(Context context) {
        this(context, null);
    }

    public HomeView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HomeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPathPaint = new Paint();
        mPathPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPathPaint.setColor(Color.BLACK);
        mPathPaint.setStrokeWidth(1);
        mPath = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPath.moveTo(45, 15);
        mPath.lineTo(15, 30);
        mPath.lineTo(25, 30);
        mPath.lineTo(25, 60);
        mPath.lineTo(40, 60);
        mPath.lineTo(40, 30);
        mPath.lineTo(50, 30);
        mPath.lineTo(50, 60);
        mPath.lineTo(65, 60);
        mPath.lineTo(65, 30);
        mPath.lineTo(75, 30);
        mPath.close();
        canvas.drawPath(mPath, mPathPaint);
    }
}
