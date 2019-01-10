package com.kgmyshin.multimodule

import android.support.v4.app.Fragment
import com.kgmyshin.common.di.ModuleInjector
import com.kgmyshin.counter.CounterInjector
import com.kgmyshin.counter.DaggerCounterComponent
import com.kgmyshin.greeting.DaggerGreetingComponent
import com.kgmyshin.greeting.GreetingInjector
import dagger.android.AndroidInjector
import dagger.android.support.HasSupportFragmentInjector

class Application : android.app.Application(), HasSupportFragmentInjector {

    private val moduleFragmentInjector = ModuleInjector<Fragment>()

    override fun supportFragmentInjector(): AndroidInjector<Fragment> =
        moduleFragmentInjector

    override fun onCreate() {
        super.onCreate()
        val counterInjector = CounterInjector()
        val counterComponent = DaggerCounterComponent.create()
        counterComponent.inject(counterInjector)

        val greetingInjector = GreetingInjector()
        val greetingComponent = DaggerGreetingComponent.builder()
            .counter(counterComponent.counter())
            .build()
        greetingComponent.inject(greetingInjector)

        moduleFragmentInjector.addInjector(counterInjector)
        moduleFragmentInjector.addInjector(greetingInjector)
    }
}