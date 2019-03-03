package com.cyberslayer.weatherforecast.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.cyberslayer.weatherforecast.data.provider.UnitProvider
import com.cyberslayer.weatherforecast.data.repository.ForecastRepository
import com.cyberslayer.weatherforecast.internal.UnitSystem
import com.cyberslayer.weatherforecast.internal.lazyDeferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class CurrentWeatherViewModel(
    forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {
    private val unitSystem = unitProvider.getUnitSystem()

    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }

    private  val weat = GlobalScope.async {
        forecastRepository.getCurrentWeather(isMetric)
    }
}
