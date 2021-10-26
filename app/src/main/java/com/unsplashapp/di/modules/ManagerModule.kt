package com.unsplashapp.di.modules

import com.data.client.api.AirQualityApi
import com.data.client.api.UnsplashApi
import com.data.repositories.AqindexGetIndexStationIdRepositoryImpl
import com.data.repositories.FindAllRepositoryImpl
import com.data.repositories.StationSensorsStationIdRepositoryImpl
import com.data.repositories.UnsplashRepositoryImpl
import com.domain.repositories.AqIndexGetIndexStationIdRepository
import com.domain.repositories.FindAllRepository
import com.domain.repositories.StationSensorsStationIdRepository
import com.domain.repositories.UnsplashRepository
import com.domain.usecases.GetAqindexGetIndexStationIdUseCase
import com.domain.usecases.GetFindAllUseCase
import com.domain.usecases.GetStationSensorsStationIdUseCase
import com.domain.usecases.GetUnsplashUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ManagerModule {

    @Provides
    @Singleton
    internal fun provideFindAllRepository(
        airQualityApi: UnsplashApi
    ): UnsplashRepository {
        return UnsplashRepositoryImpl(airQualityApi)
    }

    @Provides
    @Singleton
    fun provideGetFindAllUseCase(findAllRepository: UnsplashRepository): GetUnsplashUseCase {
        return GetUnsplashUseCase(findAllRepository)
    }
}