package com.kgmyshin.myapplication

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        MainFragmentModule::class
    ]
)
interface AppComponent : AndroidInjector<Application>