package com.sdt.tikihometest.ui.home;

import android.os.Bundle;

import com.sdt.tikihometest.R;
import com.sdt.tikihometest.databinding.ActivityMainBinding;
import com.sdt.tikihometest.ui.base.BaseActivity;

public class HomeActivity extends BaseActivity<ActivityMainBinding, HomeViewModel> {

    @Override
    protected int layoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}