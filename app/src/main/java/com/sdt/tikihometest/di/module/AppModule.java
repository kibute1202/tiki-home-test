package com.sdt.tikihometest.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = {
    RepositoriesModule.class
})
public class AppModule {

//    @Provides
//    @Singleton
//    Context provideContext(Application application) {
//        return application;
//    }

}