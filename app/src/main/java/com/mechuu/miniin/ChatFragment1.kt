package com.mechuu.miniin

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.mechuu.miniin.databinding.FragmentChat1Binding

class ChatFragment1 : Fragment() {
    private lateinit var binding: FragmentChat1Binding
    private var isNext = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChat1Binding.inflate(inflater, container, false)

        binding.chat1Et.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                if(s.toString().length >= 1) {
                    isNext = true
                    binding.chat1NextBtn.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.miniin_blue)
                } else {
                    isNext = false
                    binding.chat1NextBtn.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.dark_grey)
                }
            }
        })

        binding.chat1NextBtn.setOnClickListener {
            if(isNext) {
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.chat_frm, ChatFragment2())
                    .addToBackStack(null)
                    .commitAllowingStateLoss()
            }
        }

        return binding.root
    }
}