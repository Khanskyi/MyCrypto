package com.example.mycrypto.di

import com.example.mycrypto.data.workers.ChildWorkFactory
import com.example.mycrypto.data.workers.RefreshDataWorker
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface WorkerModule {

    @IntoMap
    @WorkerKey(RefreshDataWorker::class)
    @Binds
    fun bindsRefreshDataWorkerFactory(worker: RefreshDataWorker.Factory): ChildWorkFactory
}