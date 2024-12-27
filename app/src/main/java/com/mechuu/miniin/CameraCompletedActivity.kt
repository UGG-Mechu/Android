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
            // MainActivity로 돌아가면서 EnterFragment 실행
            val intent = Intent(this@CameraCompletedActivity, MainActivity::class.java)
            intent.putExtra("fragment_to_load", "enter")  // Intent로 fragment 정보를 전달
            startActivity(intent)
            finish()  // CameraCompletedActivity 종료
        }

    }
}