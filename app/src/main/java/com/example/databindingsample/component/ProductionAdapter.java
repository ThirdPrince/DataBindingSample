package com.example.databindingsample.component;

import android.annotation.SuppressLint;
import android.widget.TextView;

import androidx.databinding.adapters.TextViewBindingAdapter;

/**
 * @author dhl
 * @version V1.0
 * @Title: ProductionAdapter
 * @Package ProductionAdapter
 * @Description: ProductionAdapter
 * @date 2022 0511
 */
public class ProductionAdapter extends MyBindingAdapter{

    @SuppressLint("RestrictedApi")
    @Override
    public void setText(TextView view, String value) {
        TextViewBindingAdapter.setText(view,value);
    }

    @Override
    public void setTextColor(TextView view, int color) {
        view.setTextColor(color);
    }
}
