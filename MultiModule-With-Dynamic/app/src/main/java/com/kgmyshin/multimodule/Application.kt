package com.kgmyshin.multimodule

import android.support.v4.app.Fragment
import com.kgmyshin.common.di.HasDispatchingInjector
import com.kgmyshin.common.di.ModuleInjector
import com.kgmyshin.counter.CounterComponent
import com.kgmyshin.counter.CounterInjector
import com.kgmyshin.counter.DaggerCounterComponent
import dagger.android.AndroidInjector
import dagger.android.support.HasSupportFragmentInjector

class Application : android.app.Application(), HasSupportFragmentInjector {

    private val moduleFragmentInjector = ModuleInjector<Fragment>()
    private lateinit var counterComponent: CounterComponent

    override fun supportFragmentInjector(): AndroidInjector<Fragment> =
        moduleFragmentInjector

    override fun onCreate() {
        super.onCreate()
        val counterInjector = CounterInjector()
        counterComponent = DaggerCounterComponent.create()
        counterComponent.inject(counterInjector)

        moduleFragmentInjector.addInjector(counterInjector)
    }

    fun counterComponent() = counterComponent

    fun getFragmentInjectors() = moduleFragmentInjector.injectors()

    fun addFragmentInjector(injector: HasDispatchingInjector<Fragment>) {
        moduleFragmentInjector.addInjector(injector)
    }

    fun removeFragmentInjector(injector: HasDispatchingInjector<Fragment>) {
        moduleFragmentInjector.removeInjector(injector)
    }
}