package com.plcoding.weatherapp.domain.location

import android.location.Location

/**
 * Created by Mohammad Kashif Ansari on 04,April,2023
 */
interface LocationTracker {
    suspend fun getCurrentLocation():Location?
}