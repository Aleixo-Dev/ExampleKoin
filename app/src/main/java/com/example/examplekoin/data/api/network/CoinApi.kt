package com.example.examplekoin.data.api.network

import retrofit2.Retrofit

class CoinApi(private val retrofit: Retrofit) {
    fun coinService(): CoinService = retrofit.create(CoinService::class.java)
}