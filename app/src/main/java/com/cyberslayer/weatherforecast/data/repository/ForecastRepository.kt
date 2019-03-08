package com.cyberslayer.weatherforecast.data.repository

import androidx.lifecycle.LiveData
import com.cyberslayer.weatherforecast.data.db.entity.WeatherLocation
import com.cyberslayer.weatherforecast.data.db.unitlocalized.current.UnitSpecificCurrentWeatherEntry
import com.cyberslayer.weatherforecast.data.db.unitlocalized.future.list.UnitSpecificSimpleFutureWeatherEntry
import org.threeten.bp.LocalDate

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
    suspend fun getFutureWeatherList(startDate: LocalDate, metric: Boolean): LiveData<out List<UnitSpecificSimpleFutureWeatherEntry>>
    suspend fun getWeatherlocation(): LiveData<WeatherLocation>
}