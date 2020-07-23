package com.sdt.tikihometest.ui.main;

import android.os.Bundle;

import com.sdt.tikihometest.R;
import com.sdt.tikihometest.databinding.ActivityMainBinding;
import com.sdt.tikihometest.ui.base.BaseActivity;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> {

    @Override
    protected int layoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected Class<MainViewModel> getViewModelClass() {
        return MainViewModel.class;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}