package com.sdt.tikihometest.data.source.keyword;


import androidx.lifecycle.LiveData;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;


public class DefaultKeywordRepository implements KeywordRepository {

    private final KeywordDataSource local;
    private final KeywordDataSource remote;

    @Inject
    public DefaultKeywordRepository(KeywordLocalDataSource local,
                                    KeywordRemoteDataSource remote) {
        this.local = local;
        this.remote = remote;
    }

    @Override
    public Single<List<String>> getKeywords() {
        return remote.getKeywords();
    }

}
