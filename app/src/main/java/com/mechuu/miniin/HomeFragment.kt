package com.mechuu.miniin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mechuu.miniin.BillActivity
import com.mechuu.miniin.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.todaySpend.setOnClickListener {
            val intent = Intent(activity, BillActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }
}