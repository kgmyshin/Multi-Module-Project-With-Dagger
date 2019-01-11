package com.kgmyshin.greeting

import com.kgmyshin.counter.Counter
import javax.inject.Inject

internal class GreeterImpl @Inject constructor(
    private val counter: Counter
) : Greeter {
    override fun greeting(): String =
        "hello.your count is ${counter.value()}."
}