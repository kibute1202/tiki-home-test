package com.sdt.tikihometest.ui.main;

import androidx.lifecycle.ViewModel;

import com.sdt.tikihometest.di.ViewModelBuilder;
import com.sdt.tikihometest.di.ViewModelKey;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module(includes = {
    ViewModelBuilder.class
})
public abstract class MainModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    public abstract ViewModel bindViewModel(MainViewModel viewModel);

}
