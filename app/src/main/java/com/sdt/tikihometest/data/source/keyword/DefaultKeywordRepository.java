package com.sdt.tikihometest.data.source.keyword;


import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

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
    public Observable<List<String>> getKeywords() {
        return remote.getKeywords();
    }

}
