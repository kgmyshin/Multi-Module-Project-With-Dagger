package com.kgmyshin.greeting

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kgmyshin.greeting.databinding.FragmentGreeterBinding
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class GreetingFragment : Fragment() {
    @Inject
    lateinit var greeter: Greeter

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentGreeterBinding.inflate(
            inflater,
            container,
            false
        )
        binding.greetingTextView.text = greeter.greeting()
        return binding.root
    }
}