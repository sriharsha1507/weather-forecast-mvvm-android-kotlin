package com.cyberslayer.weatherforecast.data.repository

import androidx.lifecycle.LiveData
import com.cyberslayer.weatherforecast.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
}