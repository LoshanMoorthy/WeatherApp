package com.weatherapp.di

import com.weatherapp.data.location.DefaultLocationTracker
import com.weatherapp.data.repository.WeatherRepositoryImpl
import com.weatherapp.domain.location.LocationTracker
import com.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule{
    @Binds
    @Singleton
    abstract fun bindLocationTracker(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}