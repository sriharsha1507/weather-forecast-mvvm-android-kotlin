package com.cyberslayer.weatherforecast.ui.weather.future.list

import androidx.lifecycle.ViewModel;
import com.cyberslayer.weatherforecast.data.provider.UnitProvider
import com.cyberslayer.weatherforecast.data.repository.ForecastRepository
import com.cyberslayer.weatherforecast.internal.lazyDeferred
import com.cyberslayer.weatherforecast.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate
import java.util.*

class FutureListWeatherViewModel(
    forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now(), super.isMetric)
    }
}
