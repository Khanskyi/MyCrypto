package com.example.mycrypto.di

import androidx.lifecycle.ViewModel
import com.example.mycrypto.presentation.CoinViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(CoinViewModel::class)
    @Binds
    fun bindCoinViewModel(viewModel: CoinViewModel): ViewModel
}