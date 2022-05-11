package com.example.databindingsample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.databindingsample.R;
import com.example.databindingsample.app.MyApplication;
import com.example.databindingsample.component.ProductionComponent;
import com.example.databindingsample.component.TestComponent;
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

        public void onClickExpress(View view){
            startActivity(new Intent(MainActivity.this,ExpressionActivity.class));
        }

        public void onClickTwoWay(View view){
            startActivity(new Intent(MainActivity.this,TwoWayActivity.class));
        }

        public void onClickLambda(View view){
            startActivity(new Intent(MainActivity.this,LambdaActivity.class));
        }

        public void onClickAnimation(View view){
            startActivity(new Intent(MainActivity.this,AnimationActivity.class));
        }

        public void onClickComponent(View view){
           // startActivity(new Intent(MainActivity.this,AnimationActivity.class));
            if (MyApplication.isTest) {
                DataBindingUtil.setDefaultComponent(new ProductionComponent());
            } else {
                DataBindingUtil.setDefaultComponent(new TestComponent());
            }
            MyApplication.isTest = !MyApplication.isTest;
            recreate();

        }

    }
}