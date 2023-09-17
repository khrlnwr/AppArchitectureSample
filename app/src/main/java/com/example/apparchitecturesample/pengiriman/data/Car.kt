package com.example.apparchitecturesample.pengiriman.data

import com.google.gson.annotations.SerializedName

data class Car(
    @SerializedName("id_mobil") var id: Int,
    @SerializedName("no_mobil") var nomor: String,
    @SerializedName("model") var model: String,
    @SerializedName("meter_kubik") var meterKubik: Double,
    @SerializedName("metrix_ton") var metrixTon: Double,
    @SerializedName("status_aktif") var statusAktif: Int
)
