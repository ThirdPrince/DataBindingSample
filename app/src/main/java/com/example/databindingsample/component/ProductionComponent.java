package com.example.databindingsample.component;

import androidx.databinding.DataBindingComponent;

/**
 * @author dhl
 * @version V1.0
 * @Title: ProductionComponent
 * @Package ProductionComponent
 * @Description: ProductionComponent
 * @date 2022 0511
 */
public class ProductionComponent implements DataBindingComponent {

    @Override
    public MyBindingAdapter getMyBindingAdapter() {
        return new ProductionAdapter();
    }
}
