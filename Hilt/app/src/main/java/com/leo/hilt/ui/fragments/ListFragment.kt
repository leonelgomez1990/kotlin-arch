package com.leo.hilt.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.leo.hilt.databinding.ListFragmentBinding
import com.leo.hilt.ui.viewmodel.ListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListFragment : Fragment() {

    companion object {
        fun newInstance() = ListFragment()
    }

    private val viewModel: ListViewModel by viewModels()
    private lateinit var binding: ListFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ListFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        setObservers()
        binding.btnGetInformation.setOnClickListener {
            viewModel.getInformation()
        }
    }

    private fun setObservers() {
        viewModel.txtInformation.observe(this) {
            binding.txtShowInformation.text = viewModel.txtInformation.value
        }
    }


}