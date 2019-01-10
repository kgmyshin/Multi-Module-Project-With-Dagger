package com.kgmyshin.counter

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class CounterFragmentModule {
    @ContributesAndroidInjector
    abstract fun counterFragment(): CounterFragment
}