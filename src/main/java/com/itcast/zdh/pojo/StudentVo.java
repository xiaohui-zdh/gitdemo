package com.itcast.zdh.pojo;

public class StudentVo extends Student {
    private int yw_score;
    private int sx_score;
    private int yy_score;
    private float avg;

    public int getYw_score() {
        return yw_score;
    }

    public void setYw_score(int yw_score) {
        this.yw_score = yw_score;
    }

    public int getSx_score() {
        return sx_score;
    }

    public void setSx_score(int sx_score) {
        this.sx_score = sx_score;
    }

    public int getYy_score() {
        return yy_score;
    }

    public void setYy_score(int yy_score) {
        this.yy_score = yy_score;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }
}
