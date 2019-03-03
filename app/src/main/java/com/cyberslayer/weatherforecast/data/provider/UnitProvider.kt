package com.cyberslayer.weatherforecast.data.provider

import com.cyberslayer.weatherforecast.internal.UnitSystem

interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}