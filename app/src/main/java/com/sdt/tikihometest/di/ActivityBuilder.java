package com.sdt.tikihometest.di;

import com.sdt.tikihometest.ui.main.MainActivity;
import com.sdt.tikihometest.ui.main.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {
        MainModule.class
    })
    public abstract MainActivity bindActivity();

}
