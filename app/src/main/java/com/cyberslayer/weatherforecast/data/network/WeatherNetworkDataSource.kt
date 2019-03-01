package com.cyberslayer.weatherforecast.data.network

import androidx.lifecycle.LiveData
import com.cyberslayer.weatherforecast.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(
        location:String,
        languageCode: String
    )
}