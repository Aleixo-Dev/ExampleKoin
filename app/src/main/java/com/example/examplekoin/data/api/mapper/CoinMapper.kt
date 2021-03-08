package com.example.examplekoin.data.api.mapper

import com.example.examplekoin.data.api.network.response.USD
import com.example.examplekoin.data.model.Coin

class CoinMapper {

    companion object {
        fun responseToDomain(coinResponseBody: USD): Coin {
            return Coin(coinResponseBody.high, coinResponseBody.low, coinResponseBody.date, coinResponseBody.code)
        }
    }
}