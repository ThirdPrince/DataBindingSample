package com.example.databindingsample.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableBoolean;

import com.example.databindingsample.BR;

/**
 * @author dhl
 * @version V1.0
 * @Title: employee
 * @Package
 * @Description: employee
 * @date 2022 0509
 */
public class Employee extends BaseObservable {

    private String firstName;

    private String lastName;

    private String avatar;

    public ObservableBoolean isFired = new ObservableBoolean();

    public Employee(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(String lastName, String firstName, boolean fired) {
        this.firstName = firstName;
        this.lastName = lastName;
        isFired.set(fired);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);

    }

    public void setFired(boolean fired) {
        isFired.set(fired);
    }

    public ObservableBoolean getFired() {
        return isFired;
    }

    public void setAvatar(String mAvatar) {
        this.avatar = mAvatar;
    }

    public String getAvatar() {
        return avatar;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }
}
