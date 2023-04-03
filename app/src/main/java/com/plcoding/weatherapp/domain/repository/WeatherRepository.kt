package com.plcoding.weatherapp.domain.repository

import com.plcoding.weatherapp.domain.util.Resource
import com.plcoding.weatherapp.domain.weather.WeatherInfo

/**
 * Created by Mohammad Kashif Ansari on 04,April,2023
 */
interface WeatherRepository {
    suspend fun getWeatherData(lat:Double,long:Double):Resource<WeatherInfo>
}