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
        updateStatus(0)

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
                if(AppData.questionCount == 4) {
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.chat_frm, ChatFragment3())
                        .addToBackStack(null)
                        .commitAllowingStateLoss()
                }
                else {
                    AppData.questionCount++
                    updateStatus(0)
                }
            }
        }

        return binding.root
    }

    private fun updateStatus(selectedNum : Int) {
        if(AppData.questionCount == 0) {
            binding.chat2QuestionTv.text = "이 패딩 부츠는 내가 이미 가지고 있는 신발과 유사한가?"
            binding.chat2Answer1Tv.text = "이미 비슷한 신발이 여러 개 있다. 사실상 필요하지 않다."
            binding.chat2Answer2Tv.text = "비슷한 신발이 있지만, 이 부츠가 약간 다르다고 생각한다."
            binding.chat2Answer3Tv.text = "기존 신발들과 여전히 비슷하지만 나름의 차별화가 있을 수 있다."
            binding.chat2Answer4Tv.text = "유사한 신발이 거의 없거나, 이 부츠가 특별히 필요하다."
            binding.chat2Answer5Tv.text = "전혀 유사한 신발이 없다. 구매가 매우 필요하다."
        }
        else if(AppData.questionCount == 1) {
            binding.chat2QuestionTv.text = "38,160원의 가격은 내 예산에 적절한가?"
            binding.chat2Answer1Tv.text = "가격이 너무 비싸다. 내 예산에 큰 부담이 된다."
            binding.chat2Answer2Tv.text = "다소 비싸지만, 감당할 수 있는 범위 안에 있다."
            binding.chat2Answer3Tv.text = "약간 비싸긴 하지만 구매할 수 있는 수준이다."
            binding.chat2Answer4Tv.text = "내 예산 대비 적절한 가격이다. 부담이 크지 않다."
            binding.chat2Answer5Tv.text = "예산 대비 매우 합리적인 가격이다. 부담이 전혀 없다."
        }
        else if(AppData.questionCount == 2) {
            binding.chat2QuestionTv.text = "이 부츠는 내가 자주 착용하는 스타일과 잘 어울리는가?"
            binding.chat2Answer1Tv.text = "내 스타일과 전혀 맞지 않는다. 어울리지 않을 가능성이 높다."
            binding.chat2Answer2Tv.text = "내 스타일과 약간 맞지만, 완전히 어울릴지는 확신이 안 든다."
            binding.chat2Answer3Tv.text = "어울릴 가능성이 있긴 하지만, 확실하진 않다."
            binding.chat2Answer4Tv.text = "내 스타일과 상당히 맞고, 잘 어울릴 가능성이 높다."
            binding.chat2Answer5Tv.text = "내 스타일과 완벽히 어울리며, 자신감 있게 구매할 수 있다."
        }
        else if(AppData.questionCount == 3) {
            binding.chat2QuestionTv.text = "리뷰 평점(4.9점)을 신뢰할 수 있는가?"
            binding.chat2Answer1Tv.text = "리뷰를 신뢰할 수 없다. 많은 긍정적인 리뷰가 의심스럽다."
            binding.chat2Answer2Tv.text = "대부분 좋지만 일부는 의심스러운 리뷰가 있다."
            binding.chat2Answer3Tv.text = "리뷰가 대부분 긍정적이긴 하지만, 조금 신중할 필요가 있다."
            binding.chat2Answer4Tv.text = "리뷰는 매우 긍정적이다. 신뢰할 수 있을 것 같다."
            binding.chat2Answer5Tv.text = "모든 리뷰가 매우 긍정적이다. 신뢰할 수 있다."
        }
        else if(AppData.questionCount == 4) {
            binding.chat2QuestionTv.text = "이 부츠를 왜 꼭 구매해야 하는가?"
            binding.chat2Answer1Tv.text = "필요성이 전혀 없다. 다른 대안을 찾는 것이 좋다."
            binding.chat2Answer2Tv.text = "어떤 이유로 구매를 고려하고 있지만, 크게 필요하지는 않다."
            binding.chat2Answer3Tv.text = "일부 필요 요소가 있지만, 선택사항이기도 하다."
            binding.chat2Answer4Tv.text = "필요할 수 있는 요소가 있으며 구매할 만하다."
            binding.chat2Answer5Tv.text = "이 부츠가 반드시 필요하다. 구매가 매우 시급하다."
        }


        if(selectedNum == 0) {
            binding.chat2NextBtn.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.dark_grey)

            binding.chat2Pb.progress = (AppData.questionCount + 1) * 20
        }
        else {
            binding.chat2NextBtn.backgroundTintList = ContextCompat.getColorStateList(requireContext(), R.color.miniin_blue)
        }

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