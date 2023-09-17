package com.example.apparchitecturesample.pengiriman.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.apparchitecturesample.helper.ResultWrapper
import com.example.apparchitecturesample.pengiriman.repo.PengirimanRepository
import kotlinx.coroutines.runBlocking

class PengirimanViewModel(private val repository: PengirimanRepository) : ViewModel() {

    fun fetchListCar() = liveData {
        emit(ResultWrapper.loading(null))
        try {
            emit(ResultWrapper.success(repository.fetchListCar()))
        } catch (e: Exception) {
            emit(ResultWrapper.error(null, e.message ?: "Error in fetchListCar"))
        }
    }

    fun synchronizeExpedition(strListExp: String /*strListExp in json string*/) = runBlocking {
        repository.synchronizeExpedition(strListExp)
    }

}