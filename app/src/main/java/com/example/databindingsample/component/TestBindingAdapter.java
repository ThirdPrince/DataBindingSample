package com.example.databindingsample.component;

import android.widget.TextView;

import com.example.databindingsample.R;

/**
 * @author dhl
 * @version V1.0
 * @Title: TestBindingAdapter
 * @Package TestBindingAdapter
 * @Description: TestBindingAdapter
 * @date 2022 0511
 */
public class TestBindingAdapter extends MyBindingAdapter {

    @Override
    public void setText(TextView view, String value) {
       view.setText(value+"test");
    }

    @Override
    public void setTextColor(TextView view, int color) {
        if (color == view.getContext()
                .getResources()
                .getColor(R.color.white)) {
            view.setTextColor(view.getContext()
                    .getResources()
                    .getColor(R.color.textColorNight));
        }
    }
}
