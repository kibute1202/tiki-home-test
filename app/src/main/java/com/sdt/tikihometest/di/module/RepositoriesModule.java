package com.sdt.tikihometest.di.module;


import com.sdt.tikihometest.data.source.keyword.DefaultKeywordRepository;
import com.sdt.tikihometest.data.source.keyword.KeywordRepository;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class RepositoriesModule {

    @Singleton
    @Binds
    public abstract KeywordRepository bindKeywordRepository(DefaultKeywordRepository repository);

}
