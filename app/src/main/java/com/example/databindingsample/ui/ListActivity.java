package com.example.databindingsample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.databindingsample.R;
import com.example.databindingsample.databinding.ActivityListBinding;
import com.example.databindingsample.databinding.ActivityMainBinding;
import com.example.databindingsample.model.Employee;
import com.example.databindingsample.ui.adapter.EmployeeAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * ListActivity
 * @author dhl
 */
public class ListActivity extends AppCompatActivity {


    ActivityListBinding binding;

    EmployeeAdapter employeeAdapter;

    public class Presenter{

        public void onClickAddItem(View view){
            employeeAdapter.add(new Employee("嘿嘿嘿", "1", false));

        }

        public void onClickRemoveItem(View view){
            employeeAdapter.remove();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_list);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        employeeAdapter = new EmployeeAdapter(this);
        binding.recyclerView.setAdapter(employeeAdapter);
        binding.setPresenter(new Presenter());

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Zhai","Mark",false));
        employeeList.add(new Employee("Zhai2","Mark2",false));
        employeeList.add(new Employee("Zhai3","Mark3",true));
        employeeList.add(new Employee("Zhai4","Mark4",false));
        employeeAdapter.addAll(employeeList);

    }
}