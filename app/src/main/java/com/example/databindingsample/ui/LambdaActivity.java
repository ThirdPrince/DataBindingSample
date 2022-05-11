package com.example.databindingsample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.example.databindingsample.R;
import com.example.databindingsample.databinding.ActivityLambdaBinding;
import com.example.databindingsample.model.Employee;

/**
 * lambda activity
 */
public class LambdaActivity extends AppCompatActivity {

    ActivityLambdaBinding binding;
    public class Presenter{
        public void onEmployeeClick(Employee employee){
            Toast.makeText(LambdaActivity.this,"onEmployeeClick",Toast.LENGTH_SHORT).show();

        }

        /**
         * longclick 事件
         * @param employee
         * @param context
         * @return
         */
        public boolean onEmployeeLongClick(Employee employee, Context context){
            Toast.makeText(LambdaActivity.this,"onEmployeeLongClick",Toast.LENGTH_SHORT).show();
            return true;
        }

        public void onFocusChange(Employee employee, Context context){
            Toast.makeText(LambdaActivity.this,"onEmployeeLongClick",Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_lambda);
        Employee employee = new Employee("charlie","dhl");
        binding.setEmployee(employee);
        binding.setPresenter(new Presenter());
    }
}