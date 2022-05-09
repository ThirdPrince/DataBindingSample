package com.example.databindingsample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingsample.R;
import com.example.databindingsample.databinding.ActivityMainBinding;

/**
 * ListActivity
 * @author dhl
 */
public class ListActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_list);

        setContentView(R.layout.activity_list);
    }
}