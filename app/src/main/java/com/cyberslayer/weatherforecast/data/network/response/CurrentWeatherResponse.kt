package com.cyberslayer.weatherforecast.data.network.response

import com.cyberslayer.weatherforecast.data.db.entity.CurrentWeatherEntry
import com.cyberslayer.weatherforecast.data.db.entity.WeatherLocation
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    val location: WeatherLocation,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)