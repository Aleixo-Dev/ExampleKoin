package com.example.examplekoin.utils

import java.text.DecimalFormat

class FormatCoinValue {
    companion object {
        fun formatCoinValue(coinValue: String): String {
            return DecimalFormat("#0.00").format(coinValue.toDouble())
        }
    }
}