package com.example.apparchitecturesample.helper

import com.google.gson.annotations.SerializedName

data class Header(
    @field:SerializedName("success")
    val success: Int? = null,

    @field:SerializedName("message")
    val message: String? = null
)
