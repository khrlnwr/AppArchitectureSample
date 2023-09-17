package com.example.apparchitecturesample.helper

import com.example.apparchitecturesample.api.API
import com.example.apparchitecturesample.api.ApiService
import com.example.apparchitecturesample.pengiriman.repo.PengirimanRepository
import com.example.apparchitecturesample.pengiriman.viewmodel.PengirimanViewModel

class AppContainer {
    private val remoteApiService = API.instance().create(ApiService::class.java)

    private val pengirimanRepo = PengirimanRepository(remoteApiService)
    val pengirimanViewModel = PengirimanViewModel(pengirimanRepo)

}