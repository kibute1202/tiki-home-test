package com.sdt.tikihometest.data.source.keyword;

import com.sdt.tikihometest.data.remote.api.KeywordApi;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class KeywordRemoteDataSource implements KeywordDataSource {

    private KeywordApi api;

    @Inject
    public KeywordRemoteDataSource(KeywordApi api) {
        this.api = api;
    }

    @Override
    public Single<List<String>> getKeywords() {
        return api.getKeywords();
    }

}
