package com.kgmyshin.multimodule

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.kgmyshin.counter.CounterActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.counter_button).setOnClickListener {
            startActivity(Intent(this, CounterActivity::class.java))
        }
        findViewById<Button>(R.id.greeting_button).setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW).setClassName(this, "com.kgmyshin.greeting.GreetingActivity"))
        }
    }
}
