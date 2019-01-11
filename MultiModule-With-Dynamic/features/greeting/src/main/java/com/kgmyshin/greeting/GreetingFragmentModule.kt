package com.kgmyshin.greeting

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class GreetingFragmentModule {
    @ContributesAndroidInjector
    abstract fun greetingFragment(): GreetingFragment
}