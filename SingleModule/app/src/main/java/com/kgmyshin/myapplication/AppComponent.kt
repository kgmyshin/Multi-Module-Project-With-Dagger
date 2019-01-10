package com.kgmyshin.myapplication

import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        MainFragmentModule::class
    ]
)
interface AppComponent {
    fun inject(application: Application)
}