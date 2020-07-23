package com.sdt.tikihometest.data.remote.api;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface KeywordApi {

    @GET("keywords.json")
    Single<List<String>> getKeywords();

}
