package com.domain.usecases

import com.domain.entities.model.Root
import com.domain.repositories.UnsplashRepository
import io.reactivex.Single

class GetUnsplashUseCase(
    private val unsplashRepository: UnsplashRepository
) {
    fun execute(): Single<List<Root>> {
        return unsplashRepository.get()
    }
}