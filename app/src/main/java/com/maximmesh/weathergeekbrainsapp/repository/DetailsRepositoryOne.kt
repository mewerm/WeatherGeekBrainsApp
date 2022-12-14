package com.maximmesh.weathergeekbrainsapp.repository

import com.maximmesh.weathergeekbrainsapp.viewmodel.DetailsViewModel

interface DetailsRepositoryOne {
    fun getWeatherDetails(city: City, callback: DetailsViewModel.Callback)
}