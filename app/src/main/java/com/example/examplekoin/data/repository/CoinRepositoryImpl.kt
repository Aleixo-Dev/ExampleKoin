package com.example.examplekoin.data.repository

import com.example.examplekoin.data.api.mapper.CoinMapper
import com.example.examplekoin.data.api.network.CoinApi
import com.example.examplekoin.data.model.Coin
import retrofit2.awaitResponse

class CoinRepositoryImpl(private val coinApi: CoinApi) : CoinApiRepository {
    override suspend fun getCoin(): Coin? {

        val service = coinApi.coinService().getCoinValue().awaitResponse()
        val body = service.body()
        return if (service.isSuccessful && body != null) {
            CoinMapper.responseToDomain(body.uSD)
        } else {
            null
        }
    }
}