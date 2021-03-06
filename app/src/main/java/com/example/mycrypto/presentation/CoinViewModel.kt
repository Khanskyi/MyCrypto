package com.example.mycrypto.presentation

import androidx.lifecycle.ViewModel
import com.example.mycrypto.domain.GetCoinInfoListUseCase
import com.example.mycrypto.domain.GetCoinInfoUseCase
import com.example.mycrypto.domain.LoadDataUseCase
import javax.inject.Inject

class CoinViewModel @Inject constructor(
    private val getCoinInfoListUseCase: GetCoinInfoListUseCase,
    private val getCoinInfoUseCase: GetCoinInfoUseCase,
    private val loadDataUseCase: LoadDataUseCase

) : ViewModel() {

    val coinInfoList = getCoinInfoListUseCase()

    fun getDetailInfo(fSym: String) = getCoinInfoUseCase(fSym)

    init {
        loadDataUseCase()
    }
}
