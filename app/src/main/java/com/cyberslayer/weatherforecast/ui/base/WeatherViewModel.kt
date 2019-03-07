package com.cyberslayer.weatherforecast.ui.base

import androidx.lifecycle.ViewModel
import com.cyberslayer.weatherforecast.data.provider.UnitProvider
import com.cyberslayer.weatherforecast.data.repository.ForecastRepository
import com.cyberslayer.weatherforecast.internal.UnitSystem
import com.cyberslayer.weatherforecast.internal.lazyDeferred

abstract class WeatherViewModel(
    forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {
    private val unitSystem = unitProvider.getUnitSystem()

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherlocation()
    }
}