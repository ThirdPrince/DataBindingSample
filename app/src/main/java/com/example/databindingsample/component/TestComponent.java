package com.example.databindingsample.component;

import androidx.databinding.DataBindingComponent;

/**
 * @author dhl
 * @version V1.0
 * @Title: TestComponent
 * @Package TestComponent
 * @Description: TestComponent
 * @date 2022 0511
 */
public class TestComponent  implements DataBindingComponent {
    @Override
    public MyBindingAdapter getMyBindingAdapter() {
        return new TestBindingAdapter();
    }
}
