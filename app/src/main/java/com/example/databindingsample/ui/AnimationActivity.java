package com.example.databindingsample.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.OnRebindCallback;
import androidx.databinding.ViewDataBinding;
import androidx.transition.TransitionManager;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.example.databindingsample.R;
import com.example.databindingsample.databinding.ActivityAnimationBinding;

/**
 * databinding animation
 * @author dhl
 */
public class AnimationActivity extends AppCompatActivity {

    ActivityAnimationBinding binding;

    public class Presenter{
       public void onCheckedChanged(View buttonView,boolean isChecked){
           binding.setShowImage(isChecked);
       }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_animation);
        binding.setPresenter(new Presenter());
        binding.addOnRebindCallback(new OnRebindCallback() {
            @Override
            public boolean onPreBind(ViewDataBinding binding) {
                ViewGroup viewGroup = (ViewGroup) binding.getRoot();
                TransitionManager.beginDelayedTransition(viewGroup);
                return true;
            }
        });

    }
}