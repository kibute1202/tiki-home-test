package com.sdt.tikihometest.data.source.keyword;


import java.util.List;

import io.reactivex.Single;


public interface KeywordRepository {

    Single<List<String>> getKeywords();

}
