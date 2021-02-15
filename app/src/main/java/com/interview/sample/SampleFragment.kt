package com.interview.sample

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.interview.sample.databinding.SampleFragmentBinding

class SampleFragment : Fragment() {

    companion object {
        fun newInstance() = SampleFragment()
    }

    private var viewModel= SampleViewModel()
    private lateinit var binding: SampleFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.sample_fragment, container, false)
        binding.viewModel = viewModel
        return binding.root
    }


}