package com.plcoding.cryptocurrencyappyt.presentation.coin_detail_screen


import com.plcoding.cryptocurrencyappyt.domain.model.CoinDetail

data class CoinDetailState (
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null ,
    val error : String = ""
)