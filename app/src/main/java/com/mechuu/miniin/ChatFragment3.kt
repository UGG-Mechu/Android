package com.mechuu.miniin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mechuu.miniin.databinding.FragmentChat3Binding

class ChatFragment3 : Fragment() {
    private lateinit var binding: FragmentChat3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChat3Binding.inflate(inflater, container, false)

        return binding.root
    }
}