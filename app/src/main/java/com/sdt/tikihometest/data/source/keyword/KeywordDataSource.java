package com.sdt.tikihometest.data.source.keyword;


import java.util.List;

import io.reactivex.Single;


public interface KeywordDataSource {

    Single<List<String>> getKeywords();

}
