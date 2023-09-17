package com.example.apparchitecturesample.api

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

object API {
    var base_url = ""
    var proses = 0
    val url = "http://masuya1.freeddns.org:91/cobaApp2/masuyadeliverytest/"
    fun instance(): Retrofit {
        val retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(ApiWorker.gsonConverter)
            .client(ApiWorker.client)
            .build()
        return retrofit
    }
}