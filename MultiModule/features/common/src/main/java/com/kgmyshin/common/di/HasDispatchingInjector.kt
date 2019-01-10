package com.kgmyshin.common.di

import dagger.android.DispatchingAndroidInjector

interface HasDispatchingInjector<T> {
    fun dispatchingAndroidInjector(): DispatchingAndroidInjector<T>
}
