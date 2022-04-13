package com.cs.cryptocurrencyapp.presentation.coin_detail

import com.cs.cryptocurrencyapp.domain.model.Coin
import com.cs.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
