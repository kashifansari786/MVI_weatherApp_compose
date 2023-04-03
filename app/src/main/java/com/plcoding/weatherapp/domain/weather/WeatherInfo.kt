package com.plcoding.weatherapp.domain.weather

/**
 * Created by Mohammad Kashif Ansari on 04,April,2023
 */
data class WeatherInfo(
    val weatherDataPerDay:Map<Int,List<WeatherData>>,
    val currentWeatherData:WeatherData?
)
