package com.example.examplekoin.ui

import android.annotation.SuppressLint
import android.icu.text.RelativeDateTimeFormatter
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.example.examplekoin.R
import com.example.examplekoin.utils.FormatCoinValue
import kotlinx.android.synthetic.main.home_fragment.*
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : Fragment(R.layout.home_fragment) {

    private val viewModel: HomeViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initGetCoin()
    }
    @SuppressLint("SetTextI18n")
    private fun initGetCoin() {

        viewModel.coinData.observe(viewLifecycleOwner) { coin ->

            textCode.text = "NAME: ${coin.code}"
            textHigh.text = "HIGH:  ${FormatCoinValue.formatCoinValue(coin.high)}"
            textLow.text = "LOW:  ${FormatCoinValue.formatCoinValue(coin.low)}"

        }
    }
}

