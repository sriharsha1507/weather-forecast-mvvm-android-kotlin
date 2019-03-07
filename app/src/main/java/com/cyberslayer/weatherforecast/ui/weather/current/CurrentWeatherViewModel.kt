package com.cyberslayer.weatherforecast.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.cyberslayer.weatherforecast.data.provider.UnitProvider
import com.cyberslayer.weatherforecast.data.repository.ForecastRepository
import com.cyberslayer.weatherforecast.internal.UnitSystem
import com.cyberslayer.weatherforecast.internal.lazyDeferred
import com.cyberslayer.weatherforecast.ui.base.WeatherViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class CurrentWeatherViewModel(
    forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(super.isMetric)
    }

}
