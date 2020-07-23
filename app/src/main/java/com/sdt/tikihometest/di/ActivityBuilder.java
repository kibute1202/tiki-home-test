package com.sdt.tikihometest.di;

import com.sdt.tikihometest.ui.home.HomeActivity;
import com.sdt.tikihometest.ui.home.HomeModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {
        HomeModule.class
    })
    public abstract HomeActivity bindActivity();

}
