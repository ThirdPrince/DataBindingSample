package com.example.databindingsample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;

import android.os.Bundle;
import android.util.Log;

import com.example.databindingsample.R;
import com.example.databindingsample.databinding.ActivityTwoWayBinding;
import com.example.databindingsample.model.FormModel;

public class TwoWayActivity extends AppCompatActivity {

    private static final String TAG = "TwoWayActivity";

    ActivityTwoWayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_two_way);
        final FormModel model = new FormModel("markzhai", "123456");
        binding.setModel(model);
        model.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                Log.e(TAG,"propertyId = "+propertyId);

            }
        });

    }
}