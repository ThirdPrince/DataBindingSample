package com.example.databindingsample.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.library.baseAdapters.BR;
import androidx.recyclerview.widget.RecyclerView;

import com.example.databindingsample.R;
import com.example.databindingsample.generated.callback.OnClickListener;
import com.example.databindingsample.model.Employee;
import com.example.databindingsample.ui.viewholder.BindingViewHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author dhl
 * @version V1.0
 * @Title: EmployeeAdapter
 * @Package EmployeeAdapter
 * @Description: EmployeeAdapter
 * @date 2022 0509
 */
public class EmployeeAdapter extends RecyclerView.Adapter<BindingViewHolder> {

    private static final int ITEM_VIEW_TYPE_ON = 1;
    private static final int ITEM_VIEW_TYPE_OFF = 2;

    private final LayoutInflater layoutInflater;
    private OnItemClickListener listener;

    private List<Employee> employeeList;

    public interface OnItemClickListener{
        void onEmployeeClick(Employee employee);
    }

    public EmployeeAdapter(Context context) {
        this.layoutInflater = LayoutInflater.from(context);
        employeeList = new ArrayList<>();
    }


    @Override
    public int getItemViewType(int position) {
       final Employee employee = employeeList.get(position);
       if(!employee.isFired.get()){
           return ITEM_VIEW_TYPE_ON;
       }else {
           return ITEM_VIEW_TYPE_OFF;
       }

    }

    @NonNull
    @Override
    public BindingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding binding;
        if(viewType == ITEM_VIEW_TYPE_ON){
            binding = DataBindingUtil.inflate(layoutInflater, R.layout.item_employee,parent,false);
        }else{

            binding = DataBindingUtil.inflate(layoutInflater,R.layout.item_employee_off,parent,false);
        }
        return new BindingViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull BindingViewHolder holder, int position) {

        final Employee employee = employeeList.get(position);
        holder.getBinding().setVariable(BR.item,employee);
        //holder.getBinding().executePendingBindings();

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener != null){
                    listener.onEmployeeClick(employee);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    public void addAll(List<Employee> employees){
        employeeList.addAll(employees);
    }

    Random random = new Random(System.currentTimeMillis());

    public void add(Employee employee){
        int pos = random.nextInt(employeeList.size()+1);
        employeeList.add(pos,employee);
        //employeeList.add(employee)
        notifyItemInserted(pos);
    }

    public void remove(){
        if(employeeList.size() == 0){
            return;
        }
        int pos = random.nextInt(employeeList.size());
        employeeList.remove(pos);
        notifyItemRemoved(pos);
    }

}
