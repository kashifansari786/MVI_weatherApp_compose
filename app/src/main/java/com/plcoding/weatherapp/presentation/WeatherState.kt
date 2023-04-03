package com.plcoding.weatherapp.presentation

import com.plcoding.weatherapp.domain.weather.WeatherInfo

/**
 * Created by Mohammad Kashif Ansari on 04,April,2023
 */
data class WeatherState(
    val weatherInfo: WeatherInfo?=null,
    val isloading:Boolean=false,
    val error:String?=null
)
