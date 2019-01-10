package com.kgmyshin.myapplication

import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {
    @Binds
    abstract fun stringProvider(impl: MessageProviderImpl): MessageProvider
}