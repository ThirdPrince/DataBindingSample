package com.example.databindingsample.app;

import android.app.Application;
import android.provider.ContactsContract;

import androidx.databinding.DataBindingUtil;

import com.example.databindingsample.component.ProductionComponent;

/**
 * @author dhl
 * @version V1.0
 * @Title: MyApplication
 * @Package MyApplication
 * @Description: MyApplication
 * @date 2022 05 11
 */
public class MyApplication extends Application {

    public static boolean isTest = false;

    @Override
    public void onCreate() {
        super.onCreate();
        DataBindingUtil.setDefaultComponent(new ProductionComponent());
    }
}
