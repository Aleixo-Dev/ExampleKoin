package com.example.examplekoin.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.examplekoin.data.model.Coin
import com.example.examplekoin.data.repository.CoinRepositoryImpl
import kotlinx.coroutines.launch

class HomeViewModel(private val coinRepositoryImpl: CoinRepositoryImpl) : ViewModel() {

    val coinData = MutableLiveData<Coin>()

    init {
        getCoin()
    }

    private fun getCoin() {
        viewModelScope.launch {
            coinData.value = coinRepositoryImpl.getCoin()
        }
    }

}