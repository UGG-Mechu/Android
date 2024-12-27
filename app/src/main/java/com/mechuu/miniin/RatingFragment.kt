package com.mechuu.miniin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mechuu.miniin.databinding.FragmentRatingBinding

class RatingFragment : Fragment() {
    private lateinit var binding: FragmentRatingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRatingBinding.inflate(inflater, container, false)


        return binding.root
    }
}