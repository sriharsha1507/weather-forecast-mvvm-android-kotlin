package com.cyberslayer.weatherforecast.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.cyberslayer.weatherforecast.data.repository.ForecastRepository
import com.cyberslayer.weatherforecast.internal.UnitSystem
import com.cyberslayer.weatherforecast.internal.lazyDeferred

class CurrentWeatherViewModel(
    forecastRepository: ForecastRepository
) : ViewModel() {
    private val unitSystem = UnitSystem.METRIC
    val isMetric: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(isMetric)
    }
}
