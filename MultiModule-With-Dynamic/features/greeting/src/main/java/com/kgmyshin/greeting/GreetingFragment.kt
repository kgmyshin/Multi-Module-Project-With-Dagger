package com.kgmyshin.greeting

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kgmyshin.greeting.dagger.AndroidGreetingInjection
import javax.inject.Inject

class GreetingFragment : Fragment() {
    @Inject
    lateinit var greeter: Greeter

    override fun onAttach(context: Context?) {
        AndroidGreetingInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_greeter,
            container,
            false
        )
        view.findViewById<TextView>(R.id.greeting_text_view).text = greeter.greeting()
        return view
    }
}