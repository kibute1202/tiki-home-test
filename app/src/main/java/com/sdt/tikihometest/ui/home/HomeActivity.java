package com.sdt.tikihometest.ui.home;

import android.os.Bundle;
import android.widget.Toast;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.sdt.tikihometest.R;
import com.sdt.tikihometest.databinding.ActivityMainBinding;
import com.sdt.tikihometest.ui.base.BaseActivity;

import java.util.List;

public class HomeActivity extends BaseActivity<ActivityMainBinding, HomeViewModel> {

    private KeywordAdapter keywordAdapter;

    @Override
    protected int layoutResId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupKeywordUI();
        observe();
    }

    private void observe() {
        viewModel.getKeywordsLiveData().observe(this, this::setData);
    }

    private void setupKeywordUI() {
        keywordAdapter = new KeywordAdapter();
        viewDataBinding.rvKeywords.setLayoutManager(
            new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        viewDataBinding.rvKeywords.setHasFixedSize(true);
        viewDataBinding.rvKeywords.setAdapter(keywordAdapter);

        keywordAdapter.setItemClickListener(item ->
            Toast.makeText(this, item, Toast.LENGTH_SHORT).show());
    }

    private void setData(List<String> keywords) {
        keywordAdapter.submitList(keywords);
    }

}