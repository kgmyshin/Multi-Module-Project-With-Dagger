package com.kgmyshin.counter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class CounterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().apply {
                replace(
                    R.id.container,
                    CounterFragment()
                )
            }.commitNow()
        }
    }
}