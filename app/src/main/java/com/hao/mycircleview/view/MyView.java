package com.hao.mycircleview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.hao.mycircleview.bean.PieData;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016-11-30.
 */

public class MyView extends View {

    private int mWidth;
    private int mHeight;
    private Paint mPaint;
    private RectF rectF;
    private int mAngle;
    //private int[] mColors = {0xFFCCFF00, 0xFF6495ED, 0xFFE32636, 0xFF800000, 0xFF808000, 0xFFFF8C69, 0xFF808080, 0xFFE6B800, 0xFF7CFC00};
    private ArrayList<PieData> list;
    private float x;
    private float y;

    public MyView(Context context) {
        this(context, null);
    }

    public MyView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

        init();
    }

    private void init() {
        mPaint = new Paint();
        //mPaint.setColor(Color.BLACK);
        //mPaint.setARGB(255,125,100,100);
        rectF = new RectF(10, 10, 200, 200);
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(100);
        x = 10;
        y = 10;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.save();
        canvas.drawText("字体移动", x, y, mPaint);
        canvas.restore();

        for (int i = 0; i < list.size(); i++) {
            canvas.drawArc(rectF, mAngle, list.get(i).getmAngles(), true, mPaint);
            mPaint.setColor(list.get(i).getmColor());
            mAngle += list.get(i).getmAngles();
        }

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

        mWidth = w;
        mHeight = h;

    }

    public void setPieData(ArrayList<PieData> list) {
        this.list = list;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                x = event.getX();
                y = event.getY();
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                break;
        }

        return true;
    }
}
