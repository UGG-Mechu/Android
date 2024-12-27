package com.mechuu.miniin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mechuu.miniin.databinding.FragmentEnterBinding

class EnterFragment : Fragment() {
    private lateinit var binding: FragmentEnterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEnterBinding.inflate(inflater, container, false)


        return binding.root
    }
}