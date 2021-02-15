package com.interview.sample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.interview.sample.databinding.SampleFragmentBinding
import kotlinx.android.synthetic.main.sample_fragment.*

class SampleFragment : Fragment() {

    companion object {
        fun newInstance() = SampleFragment()
    }

    private var viewModel= SampleViewModel()
    private lateinit var binding: SampleFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.sample_fragment, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_back.setOnClickListener {
            findNavController().navigate(R.id.action_SampleFragment_to_SecondFragment)
        }
        button_toggle.setOnClickListener {
            viewModel.showHello.value = !viewModel.showHello.value!!
        }
    }
}