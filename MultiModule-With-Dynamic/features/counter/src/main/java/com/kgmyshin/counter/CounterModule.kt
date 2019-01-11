package com.kgmyshin.counter

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
internal abstract class CounterModule {
    @Singleton
    @Binds
    abstract fun provideCounter(impl: CounterImpl): Counter
}