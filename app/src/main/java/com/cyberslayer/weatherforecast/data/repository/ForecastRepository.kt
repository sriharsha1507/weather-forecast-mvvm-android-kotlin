package com.cyberslayer.weatherforecast.data.repository

import androidx.lifecycle.LiveData
import com.cyberslayer.weatherforecast.data.db.entity.WeatherLocation
import com.cyberslayer.weatherforecast.data.db.unitlocalized.current.UnitSpecificCurrentWeatherEntry

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
    suspend fun getWeatherlocation(): LiveData<WeatherLocation>
}