package com.plcoding.weatherapp.data.remote

import com.squareup.moshi.Json

/**
 * Created by Mohammad Kashif Ansari on 04,April,2023
 */
data class WeatherDto(

    @field:Json(name="hourly")
    val weatherData: WeatherDataDto
)
