package com.hao.mycircleview.bean;

/**
 * Created by Administrator on 2016-11-30.
 */

public class PieData {
    private int mColor;
    private int mAngles;

    public int getmColor() {
        return mColor;
    }

    public void setmColor(int mColor) {
        this.mColor = mColor;
    }

    public int getmAngles() {
        return mAngles;
    }

    public void setmAngles(int mAngles) {
        this.mAngles = mAngles;
    }

    public PieData(int mColor, int mAngles) {
        this.mColor = mColor;
        this.mAngles = mAngles;
    }
}
