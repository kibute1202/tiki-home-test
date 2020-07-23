package com.sdt.tikihometest.ui.base;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.sdt.tikihometest.BR;
import com.sdt.tikihometest.ui.custom.LoadingDialog;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public abstract class BaseActivity<V extends ViewDataBinding, VM extends BaseViewModel> extends DaggerAppCompatActivity {

    @Inject
    protected VM viewModel;
    @Inject
    protected ViewModelProvider.Factory viewModelFactory;

    protected V viewDataBinding;

    private Dialog alertDialog;
    private LoadingDialog loadingDialog;

    protected abstract
    @LayoutRes
    int layoutResId();

    protected abstract Class<VM> getViewModelClass();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this, viewModelFactory).get(getViewModelClass());
        performDataBinding();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        hideAlert();
        hideLoading();
        super.onDestroy();
    }

    private void performDataBinding() {
        viewDataBinding = DataBindingUtil.setContentView(this, layoutResId());
        viewDataBinding.setVariable(BR.viewModel, viewModel);
        viewDataBinding.executePendingBindings();
    }

    protected void addFragment(@IdRes int containerId,
                               Fragment fragment,
                               String tag,
                               boolean addToBackStack,
                               int transition) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(containerId, fragment, tag);
        commitTransaction(transaction, addToBackStack, transition);
    }

    protected void replaceFragment(@IdRes int containerId,
                                   Fragment fragment,
                                   String tag,
                                   boolean addToBackStack,
                                   int transition) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(containerId, fragment, tag);
        commitTransaction(transaction, addToBackStack, transition);
    }

    private void commitTransaction(FragmentTransaction transaction,
                                   boolean addToBackStack,
                                   int transition) {
        if (addToBackStack) transaction.addToBackStack(null);
        transaction.setTransition(transition);
    }

    protected void showLoading() {
        if (loadingDialog == null) {
            loadingDialog = new LoadingDialog(this);
        }
        loadingDialog.show();
    }

    protected void hideLoading() {
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
    }

    protected void showAlert() {
    }

    protected void hideAlert() {
    }

}
