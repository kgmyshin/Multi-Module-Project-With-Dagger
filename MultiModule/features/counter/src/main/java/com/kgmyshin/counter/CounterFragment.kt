package com.kgmyshin.counter

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kgmyshin.counter.databinding.FragmentCounterBinding
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class CounterFragment : Fragment() {
    @Inject
    lateinit var counter: Counter

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCounterBinding.inflate(
            inflater,
            container,
            false
        )
        binding.counterTextView.text = "${counter.value()}"
        binding.incrementButton.setOnClickListener {
            counter.increment()
            binding.counterTextView.text = "${counter.value()}"
        }
        return binding.root
    }
}