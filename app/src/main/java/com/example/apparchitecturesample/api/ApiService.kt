package com.example.apparchitecturesample.api

import com.example.apparchitecturesample.helper.Header
import com.example.apparchitecturesample.pengiriman.data.ResponseGetListCar
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {
    @POST("pengiriman/get_list_car.php")
    suspend fun fetchListCar() : ResponseGetListCar

    @FormUrlEncoded
    @POST("synchronization/synchronize_to_server.php")
    suspend fun synchronizeExpedition(@Field("list_expedisi") listExpedisi: String) : Header

}