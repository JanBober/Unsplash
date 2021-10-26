package com.data.client.api

import com.domain.entities.model.Root
import io.reactivex.Single
import retrofit2.http.GET

interface UnsplashApi {

    @GET("?client_id=gkoGjkJctv1f1u5MnN2R73zk7IoyNL3R9IUVDX3-_Do")
    fun apiUnsplashGet(): Single<List<Root>>
}