package com.example.examplekoin.di

import com.example.examplekoin.data.api.network.CoinApi
import com.example.examplekoin.data.repository.CoinRepositoryImpl
import com.example.examplekoin.ui.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val apiModules = module {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://economia.awesomeapi.com.br/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    single { CoinApi(retrofit = retrofit) }
}

val homeModule = module {
    viewModel {
        HomeViewModel(
            CoinRepositoryImpl(
                coinApi = get()
            )
        )
    }
}