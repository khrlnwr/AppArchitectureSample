package com.example.apparchitecturesample.pengiriman.repo

import androidx.annotation.WorkerThread
import com.example.apparchitecturesample.api.ApiService
import com.example.apparchitecturesample.helper.ResultWrapper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PengirimanRepository(private val apiService: ApiService) {
    suspend fun fetchListCar() = apiService.fetchListCar()

    @WorkerThread
    suspend fun synchronizeExpedition(strListExp: String /*strListExp in json string*/) = withContext(
        Dispatchers.IO
    ) {
        try {
            return@withContext ResultWrapper.success(apiService.synchronizeExpedition(strListExp))
        } catch (t: Throwable) {
            return@withContext ResultWrapper.error(null, t.message ?: "Error in synchronizing process")
        }
    }
}