package com.weatherapp.domain.repository

import com.weatherapp.domain.util.Resource
import com.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}