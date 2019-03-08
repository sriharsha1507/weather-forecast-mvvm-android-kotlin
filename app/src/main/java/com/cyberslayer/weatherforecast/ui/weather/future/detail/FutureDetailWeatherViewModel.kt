package com.cyberslayer.weatherforecast.ui.weather.future.detail

import com.cyberslayer.weatherforecast.data.provider.UnitProvider
import com.cyberslayer.weatherforecast.data.repository.ForecastRepository
import com.cyberslayer.weatherforecast.internal.lazyDeferred
import com.cyberslayer.weatherforecast.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureDetailWeatherViewModel(
    private val detailDate: LocalDate,
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getFutureWeatherByDate(detailDate, super.isMetric)
    }
}
