package com.cyberslayer.weatherforecast.data.network.response

import com.cyberslayer.weatherforecast.data.db.entity.FutureWeatherEntry
import com.google.gson.annotations.SerializedName

data class ForecastDaysContainer(
    @SerializedName("forecastday")
    val entries: List<FutureWeatherEntry>
)