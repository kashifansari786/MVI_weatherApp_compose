package com.plcoding.weatherapp.domain.weather

import java.time.LocalDateTime

/**
 * Created by Mohammad Kashif Ansari on 04,April,2023
 */
data class WeatherData(
    val time:LocalDateTime,
    val temoretureCelsius:Double,
    val pressure:Double,
    val windSpeed:Double,
    val humidity:Double,
    val weatherType: WeatherType
)
