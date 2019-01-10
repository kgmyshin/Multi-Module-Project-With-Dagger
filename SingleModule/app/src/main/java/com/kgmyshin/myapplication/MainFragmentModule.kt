package com.kgmyshin.myapplication

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentModule {

    @ContributesAndroidInjector
    abstract fun mainFragment(): MainFragment
}