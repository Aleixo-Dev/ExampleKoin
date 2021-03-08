package com.example.examplekoin.data.repository

import com.example.examplekoin.data.model.Coin

interface CoinApiRepository {
    suspend fun getCoin() : Coin?
}