package com.cyberslayer.weatherforecast.data.network.response

import com.cyberslayer.weatherforecast.data.db.entity.WeatherLocation
import com.google.gson.annotations.SerializedName

data class FutureWeatherResponse(
    @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer,
    val location: WeatherLocation
)