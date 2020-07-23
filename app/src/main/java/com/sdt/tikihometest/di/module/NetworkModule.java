package com.sdt.tikihometest.di.module;

import android.content.Context;

import com.sdt.tikihometest.R;
import com.sdt.tikihometest.data.remote.api.KeywordApi;
import com.sdt.tikihometest.data.remote.NetworkHelper;
import com.sdt.tikihometest.utils.Constants;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class NetworkModule {

    @Provides
    @Singleton
    @Named(Constants.BASE_URL_NAME)
    String provideBaseUrl(Context context) {
        return context.getString(R.string.base_url);
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(@Named(Constants.BASE_URL_NAME) String baseUrl) {
        return NetworkHelper.createRetrofit(baseUrl);
    }

    @Provides
    @Singleton
    KeywordApi provideKeywordApi(Retrofit retrofit) {
        return retrofit.create(KeywordApi.class);
    }

}
