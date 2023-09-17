package com.example.apparchitecturesample.helper

data class ResultWrapper<out T> (val status: Status, val data: T?, val message: String?) {
    companion object {
        fun <T> success(data: T): ResultWrapper<T> = ResultWrapper(Status.SUCCESS, data, null)
        fun <T> loading(data: T?): ResultWrapper<T> = ResultWrapper(Status.LOADING, data, null)
        fun <T> error(data: T?, message: String): ResultWrapper<T> = ResultWrapper(Status.ERROR, data, message)
    }
}
