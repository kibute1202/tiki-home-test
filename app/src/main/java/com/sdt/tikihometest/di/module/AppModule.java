package com.sdt.tikihometest.di.module;

import android.app.Application;
import android.content.Context;

import com.sdt.tikihometest.utils.rx.AppSchedulerProvider;
import com.sdt.tikihometest.utils.rx.SchedulerProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = {
    RepositoriesModule.class
})
public class AppModule {

    @Provides
    @Singleton
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

}
