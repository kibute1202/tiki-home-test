package com.sdt.tikihometest.ui.home;

import androidx.lifecycle.ViewModel;

import com.sdt.tikihometest.di.ViewModelBuilder;
import com.sdt.tikihometest.di.ViewModelKey;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module(includes = {
    ViewModelBuilder.class
})
public abstract class HomeModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel.class)
    public abstract ViewModel bindViewModel(HomeViewModel viewModel);

}
