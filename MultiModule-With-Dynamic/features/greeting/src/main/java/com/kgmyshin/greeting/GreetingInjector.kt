package com.kgmyshin.greeting

import android.support.v4.app.Fragment
import com.kgmyshin.common.di.HasDispatchingInjector
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject

class GreetingInjector : HasDispatchingInjector<Fragment> {
    @Inject
    lateinit var supportFragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun dispatchingAndroidInjector(): DispatchingAndroidInjector<Fragment> =
        supportFragmentInjector
}