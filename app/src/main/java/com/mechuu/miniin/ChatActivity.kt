package com.mechuu.miniin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mechuu.miniin.databinding.ActivityChatBinding

class ChatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chatBackIv.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.chat_frm, ChatFragment1())
            .commitAllowingStateLoss()
    }
}