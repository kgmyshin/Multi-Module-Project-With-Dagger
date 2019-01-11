package com.kgmyshin.greeting

import dagger.Binds
import dagger.Module

@Module
internal abstract class GreetingModule {
    @Binds
    abstract fun provideGreeter(impl: GreeterImpl): Greeter
}