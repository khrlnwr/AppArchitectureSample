package com.example.apparchitecturesample.pengiriman.data

import com.example.apparchitecturesample.helper.Header
import com.google.gson.annotations.SerializedName

data class ResponseGetListCar(
    @SerializedName("header") var header: Header,
    @SerializedName("body") var body: ArrayList<Car>
)
