package com.example.go2byx.myapplication;

import android.graphics.drawable.Drawable;

/**
 * Created by go2byx on 2017-11-30.
 */

public class ListViewItem {
    private Drawable icon;
    private String title;
    private String desc;

    public void setIcon(Drawable d) {
        icon = d;
    }

    public void setTitle(String s) {
        title = s;
    }

    public void setDesc(String s) {
        desc = s;
    }

    public Drawable getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}
