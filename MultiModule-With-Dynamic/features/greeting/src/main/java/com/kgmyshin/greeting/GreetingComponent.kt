package com.kgmyshin.greeting

import com.kgmyshin.counter.Counter
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        GreetingModule::class,
        GreetingFragmentModule::class
    ]
)
interface GreetingComponent : AndroidInjector<GreetingInjector> {
    @Component.Builder
    interface Builder {
        fun build(): GreetingComponent
        @BindsInstance
        fun counter(counter: Counter): Builder
    }
}