package com.example.databindingsample.ui.bindingadapter;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

/**
 * @author dhl
 * @version V1.0
 * @Title: DemoBindingAdapter
 * @Package $
 * @Description: DemoBindingAdapter
 * @date 2022 0510
 */
public class DemoBindingAdapter {

    private static final String TAG = "DemoBindingAdapter";

    @BindingAdapter({"imageUrl","placeholder"})
    public static void loadImageFromUrl(ImageView imageView, String imageUrl, Drawable placeholder){

        Log.e(TAG,"loadImageFromUrl");
        Glide.with(imageView.getContext()).load(imageUrl).placeholder(placeholder).into(imageView);

    }
}
