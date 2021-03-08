package com.example.examplekoin.data.api.network.response

import com.squareup.moshi.Json

data class USD(
    @field:Json(name = "high")
    val high: String,
    @field:Json(name = "low")
    val low: String,
    @field:Json(name = "create_date")
    val date: String,
    @field:Json(name = "code")
    val code : String
)
