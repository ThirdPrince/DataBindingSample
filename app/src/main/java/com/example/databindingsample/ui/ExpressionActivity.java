package com.example.databindingsample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingsample.R;
import com.example.databindingsample.databinding.ActivityExpressionBinding;
import com.example.databindingsample.model.Employee;

import java.util.Random;

/**
 *
 */
public class ExpressionActivity extends AppCompatActivity {

    ActivityExpressionBinding binding;
     Random random = new Random(System.currentTimeMillis());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_expression);
        Employee employee = new Employee("mark", "zhai");
        employee.setFired(random.nextBoolean());

        employee.setAvatar("https://avatars2.githubusercontent.com/u/1106500?v=3&s=460");
        binding.setEmployee(employee);
    }
}