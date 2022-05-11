package com.example.databindingsample.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.databindingsample.BR;

import java.io.BufferedReader;


/**
 * @author dhl
 * @version V1.0
 * @Title: $
 * @Package $
 * @Description: FormModel 双向绑定test class
 * @date 2022 0510
 */
public class FormModel extends BaseObservable {

    private String name;
    private String password;

    public FormModel(String name,String password){
        this.name = name;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);

    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Bindable
    public String getPassword() {
        return password;
    }
}
