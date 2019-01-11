package com.kgmyshin.counter

import javax.inject.Inject

internal class CounterImpl @Inject constructor() : Counter {
    var value = 0

    override fun value(): Int = value
    override fun increment() {
        value++
    }
}