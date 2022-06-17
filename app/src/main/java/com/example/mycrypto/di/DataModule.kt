package com.example.mycrypto.di

import android.app.Application
import com.example.mycrypto.data.database.AppDatabase
import com.example.mycrypto.data.database.CoinInfoDao
import com.example.mycrypto.data.network.ApiFactory
import com.example.mycrypto.data.network.ApiService
import com.example.mycrypto.data.repository.CoinRepositoryImpl
import com.example.mycrypto.domain.CoinRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @Binds
    @ApplicationScope
    fun bindsCoinRepository(impl: CoinRepositoryImpl): CoinRepository

    companion object{
        @Provides
        @ApplicationScope
        fun providesCoinInfoDao(application: Application): CoinInfoDao{
            return AppDatabase.getInstance(application).coinPriceInfoDao()
        }

        @Provides
        @ApplicationScope
        fun providesApiService(): ApiService{
            return ApiFactory.apiService
        }
    }

}