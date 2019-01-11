package com.kgmyshin.greeting.dagger

import android.support.v4.app.Fragment
import com.kgmyshin.greeting.DaggerGreetingComponent
import com.kgmyshin.greeting.GreetingInjector
import com.kgmyshin.multimodule.Application
import dagger.android.support.AndroidSupportInjection

object AndroidGreetingInjection {
    fun inject(fragment: Fragment) {
        val application = fragment.requireActivity().application as Application
        if (application.getFragmentInjectors().all { it !is GreetingInjector }) {
            val injector = GreetingInjector()
            val component =
                DaggerGreetingComponent.builder()
                    .counter(application.counterComponent().counter())
                    .build()
            component.inject(injector)
            application.addFragmentInjector(injector)
        }
        AndroidSupportInjection.inject(fragment)
    }
}