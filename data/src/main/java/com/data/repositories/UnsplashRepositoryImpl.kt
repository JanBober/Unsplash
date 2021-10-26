package com.data.repositories

import com.data.client.api.UnsplashApi
import com.domain.entities.model.Root
import com.domain.repositories.UnsplashRepository
import io.reactivex.Single

class UnsplashRepositoryImpl(
    private val unsplashApi: UnsplashApi
) : UnsplashRepository {
    override fun get(): Single<List<Root>> {
        return unsplashApi.apiUnsplashGet()
    }

}