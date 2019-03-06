package com.cyberslayer.weatherforecast.data.db.entity

import androidx.room.Embedded
import com.cyberslayer.weatherforecast.data.db.entity.Condition
import com.google.gson.annotations.SerializedName

data class Day(
    @SerializedName("avgtemp_c")
    val avgtempC: Double,
    @SerializedName("avgtemp_f")
    val avgtempF: Double,
    @SerializedName("avgvis_km")
    val avgvisKm: Double,
    @SerializedName("avgvis_miles")
    val avgvisMiles: Int,
    @Embedded(prefix = "condition_")
    val condition: Condition,
    @SerializedName("maxtemp_c")
    val maxtempC: Int,
    @SerializedName("maxtemp_f")
    val maxtempF: Int,
    @SerializedName("maxwind_kph")
    val maxwindKph: Double,
    @SerializedName("maxwind_mph")
    val maxwindMph: Double,
    @SerializedName("mintemp_c")
    val mintempC: Double,
    @SerializedName("mintemp_f")
    val mintempF: Double,
    @SerializedName("totalprecip_in")
    val totalprecipIn: Double,
    @SerializedName("totalprecip_mm")
    val totalprecipMm: Double,
    val uv: Int
)