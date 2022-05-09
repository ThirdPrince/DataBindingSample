package com.example.databindingsample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databindingsample.R;
import com.example.databindingsample.databinding.ActivityDemoBinding;
import com.example.databindingsample.model.Employee;

/**
 * databinding 学习
 * @author dhl
 */
public class DemoActivity extends AppCompatActivity {

    Employee employee = new Employee("charlie","d");

    ActivityDemoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_demo);
         binding = DataBindingUtil.setContentView(this,R.layout.activity_demo);
        binding.setEmployee(employee);
        binding.setPresenter(new Presenter());
    }

    public class Presenter{
       public void onTextChanged(CharSequence s, int start, int before, int count){
            employee.setFirstName(s.toString());
        }

        public void onTextChangedLast(CharSequence s, int start, int before, int count){
            employee.setLastName(s.toString());
        }

       public void onClick(View view){
            Toast.makeText(DemoActivity.this,"ni点击我了",Toast.LENGTH_LONG).show();
        }

        public void onClickListener(Employee employee){
            Toast.makeText(DemoActivity.this,employee.getLastName()+" 点击我了",Toast.LENGTH_LONG).show();
        }
    }
}