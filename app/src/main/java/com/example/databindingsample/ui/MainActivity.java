package com.example.databindingsample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.databindingsample.R;
import com.example.databindingsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setPresenter(new Presenter());


    }

    public class Presenter{

        public void onClickSimpleDemo(View view){
            startActivity(new Intent(MainActivity.this,DemoActivity.class));
        }

        public void onClickListDemo(View view){
            startActivity(new Intent(MainActivity.this,ListActivity.class));
        }



    }
}