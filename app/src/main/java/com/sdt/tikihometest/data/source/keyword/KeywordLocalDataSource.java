package com.sdt.tikihometest.data.source.keyword;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class KeywordLocalDataSource implements KeywordDataSource {

    @Inject
    public KeywordLocalDataSource() {
    }

    @Override
    public Observable<List<String>> getKeywords() {
        return null;
    }

}
