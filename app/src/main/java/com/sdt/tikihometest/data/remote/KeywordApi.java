package com.sdt.tikihometest.data.remote;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface KeywordApi {

    @GET("keywords.json")
    Observable<List<String>> getKeywords();

}
