package com.example.examplekoin.data.api.network

import com.example.examplekoin.data.api.network.response.CoinResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface CoinService {

    @GET("json/all/usd")
    fun getCoinValue(): Call<CoinResponseBody>

}