package com.kgmyshin.common.di

import dagger.android.AndroidInjector

class ModuleInjector<T> : AndroidInjector<T> {

    private val injectors = mutableListOf<HasDispatchingInjector<T>>()

    fun injectors(): List<HasDispatchingInjector<T>> = injectors

    fun addInjector(injector: HasDispatchingInjector<T>) {
        injectors.add(injector)
    }

    fun removeInjector(injector: HasDispatchingInjector<T>) {
        injectors.remove(injector)
    }

    fun contains(injector: HasDispatchingInjector<T>): Boolean = injectors.contains(injector)

    override fun inject(instance: T) {
        val wasInjected = injectors.any { it.dispatchingAndroidInjector().maybeInject(instance) }
        if (!wasInjected) {
            throw IllegalArgumentException("injection failed")
        }
    }
}
