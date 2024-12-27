package com.mechuu.miniin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.mechuu.miniin.databinding.FragmentChat2Binding

class ChatFragment2 : Fragment() {
    private lateinit var binding: FragmentChat2Binding
    private var isSelected = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChat2Binding.inflate(inflater, container, false)

        binding.chat2Answer1Tv.setOnClickListener {
            updateStatus(1)
        }
        binding.chat2Answer2Tv.setOnClickListener {
            updateStatus(2)
        }
        binding.chat2Answer3Tv.setOnClickListener {
            updateStatus(3)
        }
        binding.chat2Answer4Tv.setOnClickListener {
            updateStatus(4)
        }
        binding.chat2Answer5Tv.setOnClickListener {
            updateStatus(5)
        }

        binding.chat2NextBtn.setOnClickListener {
            if(isSelected != 0) {
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.chat_frm, ChatFragment3())
                    .addToBackStack(null)
                    .commitAllowingStateLoss()
            }
        }

        return binding.root
    }

    private fun updateStatus(selectedNum : Int) {
        binding.chat2NextBtn.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.miniin_blue)

        if(isSelected == 1) {
            binding.chat2Check1Iv.visibility = View.GONE
            binding.chat2Answer1Tv.setTextColor(ContextCompat.getColor(requireContext(), R.color.dark_grey))
            binding.chat2Answer1Tv.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.white)
        }
        else if (isSelected == 2) {
            binding.chat2Check2Iv.visibility = View.GONE
            binding.chat2Answer2Tv.setTextColor(ContextCompat.getColor(requireContext(), R.color.dark_grey))
            binding.chat2Answer2Tv.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.white)
        }
        else if (isSelected == 3) {
            binding.chat2Check3Iv.visibility = View.GONE
            binding.chat2Answer3Tv.setTextColor(ContextCompat.getColor(requireContext(), R.color.dark_grey))
            binding.chat2Answer3Tv.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.white)
        }
        else if (isSelected == 4) {
            binding.chat2Check4Iv.visibility = View.GONE
            binding.chat2Answer4Tv.setTextColor(ContextCompat.getColor(requireContext(), R.color.dark_grey))
            binding.chat2Answer4Tv.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.white)
        }
        else if (isSelected == 5) {
            binding.chat2Check5Iv.visibility = View.GONE
            binding.chat2Answer5Tv.setTextColor(ContextCompat.getColor(requireContext(), R.color.dark_grey))
            binding.chat2Answer5Tv.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.white)
        }

        isSelected = selectedNum

        if(isSelected == 1) {
            binding.chat2Check1Iv.visibility = View.VISIBLE
            binding.chat2Answer1Tv.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
            binding.chat2Answer1Tv.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.miniin_blue)
        }
        else if (isSelected == 2) {
            binding.chat2Check2Iv.visibility = View.VISIBLE
            binding.chat2Answer2Tv.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
            binding.chat2Answer2Tv.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.miniin_blue)
        }
        else if (isSelected == 3) {
            binding.chat2Check3Iv.visibility = View.VISIBLE
            binding.chat2Answer3Tv.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
            binding.chat2Answer3Tv.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.miniin_blue)
        }
        else if (isSelected == 4) {
            binding.chat2Check4Iv.visibility = View.VISIBLE
            binding.chat2Answer4Tv.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
            binding.chat2Answer4Tv.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.miniin_blue)
        }
        else if (isSelected == 5) {
            binding.chat2Check5Iv.visibility = View.VISIBLE
            binding.chat2Answer5Tv.setTextColor(ContextCompat.getColor(requireContext(), R.color.white))
            binding.chat2Answer5Tv.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.miniin_blue)
        }
    }
}