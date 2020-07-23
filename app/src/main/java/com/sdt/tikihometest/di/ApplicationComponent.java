package com.sdt.tikihometest.di;

import android.content.Context;

import com.sdt.tikihometest.App;
import com.sdt.tikihometest.di.module.AppModule;
import com.sdt.tikihometest.di.module.NetworkModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;


/**
 * Main component for the application.
 */
@Singleton
@Component(modules = {
    AndroidSupportInjectionModule.class,
    AppModule.class,
    NetworkModule.class,
    ActivityBuilder.class,
})
public interface ApplicationComponent extends AndroidInjector<App> {

    @Component.Factory
    interface Factory {
        ApplicationComponent create(@BindsInstance Context applicationContext);
    }

}
