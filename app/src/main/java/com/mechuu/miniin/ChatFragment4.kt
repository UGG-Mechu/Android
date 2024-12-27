package com.mechuu.miniin

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mechuu.miniin.databinding.FragmentChat4Binding

class ChatFragment4 : Fragment() {
    private lateinit var binding: FragmentChat4Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChat4Binding.inflate(inflater, container, false)

        val delayMilis = 3000L
        Handler(Looper.myLooper()!!).postDelayed({
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.chat_frm, ChatFragment4())
                .addToBackStack(null)
                .commitAllowingStateLoss()
        }, delayMilis)

        binding.chat4NextBtn.setOnClickListener {
            requireActivity().finish()
        }

        return binding.root
    }
}