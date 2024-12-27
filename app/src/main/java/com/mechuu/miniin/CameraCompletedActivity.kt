package com.mechuu.miniin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mechuu.miniin.databinding.ActivityCameracompletedBinding

class CameraCompletedActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCameracompletedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCameracompletedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checkSpend.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }

    }
}