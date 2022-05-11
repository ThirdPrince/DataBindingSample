package com.example.databindingsample.component;

import android.widget.TextView;

import androidx.databinding.BindingAdapter;

/**
 * @author dhl
 * @version V1.0
 * @Title: MyBindingAdapter
 * @Package MyBindingAdapter
 * @Description: MyBindingAdapter
 * @date 2022 05 11
 */
public abstract class MyBindingAdapter {

    @BindingAdapter("android:text")
    public abstract void setText(TextView view,String value);

    @BindingAdapter("android:textColor")
    public abstract void setTextColor(TextView view,int color);
}
