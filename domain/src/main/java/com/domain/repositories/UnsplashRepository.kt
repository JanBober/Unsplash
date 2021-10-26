package com.domain.repositories

import com.domain.entities.model.Root
import io.reactivex.Single

interface UnsplashRepository {
    fun get(): Single<List<Root>>
}