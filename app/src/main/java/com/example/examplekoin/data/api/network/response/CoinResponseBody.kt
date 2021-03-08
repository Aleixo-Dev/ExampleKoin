package com.example.examplekoin.data.api.network.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class CoinResponseBody(
    @field:Json(name = "USD")
    val uSD: USD
)