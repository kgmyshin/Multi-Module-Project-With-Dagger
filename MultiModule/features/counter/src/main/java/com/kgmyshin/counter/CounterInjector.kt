package com.kgmyshin.counter

import android.support.v4.app.Fragment
import com.kgmyshin.common.di.HasDispatchingInjector
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject

class CounterInjector : HasDispatchingInjector<Fragment> {

    @Inject
    lateinit var supportFragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun dispatchingAndroidInjector(): DispatchingAndroidInjector<Fragment> =
        supportFragmentInjector
}