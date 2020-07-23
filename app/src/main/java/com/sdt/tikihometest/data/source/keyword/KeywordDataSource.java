package com.sdt.tikihometest.data.source.keyword;

import java.util.List;

import io.reactivex.Observable;

public interface KeywordDataSource {

    Observable<List<String>> getKeywords();

}
