package com.kgmyshin.counter

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        CounterModule::class,
        CounterFragmentModule::class
    ]
)
interface CounterComponent : AndroidInjector<CounterInjector> {
    fun counter(): Counter
}