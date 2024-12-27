package com.mechuu.miniin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mechuu.miniin.databinding.FragmentChat2Binding

class ChatFragment2 : Fragment() {
    private lateinit var binding: FragmentChat2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChat2Binding.inflate(inflater, container, false)

        return binding.root
    }
}