package com.sdt.tikihometest.data.source.keyword;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class KeywordLocalDataSource implements KeywordDataSource {

    @Inject
    public KeywordLocalDataSource() {
    }

    @Override
    public Single<List<String>> getKeywords() {
        return null;
    }

}
