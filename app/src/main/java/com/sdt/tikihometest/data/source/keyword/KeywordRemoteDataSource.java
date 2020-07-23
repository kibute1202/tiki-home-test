package com.sdt.tikihometest.data.source.keyword;

import com.sdt.tikihometest.data.remote.api.KeywordApi;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class KeywordRemoteDataSource implements KeywordDataSource {

    private KeywordApi api;

    @Inject
    public KeywordRemoteDataSource(KeywordApi api) {
        this.api = api;
    }

    @Override
    public Observable<List<String>> getKeywords() {
        return api.getKeywords();
    }

}
