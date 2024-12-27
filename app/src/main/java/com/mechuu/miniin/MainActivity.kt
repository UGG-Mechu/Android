package com.mechuu.miniin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mechuu.miniin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBottomNavigation()
        
        binding.moveToChat.setOnClickListener {
            val intent= Intent(this,ChatActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initBottomNavigation() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_frm, HomeFragment())
            .commitAllowingStateLoss()
        binding.mainBottomNav.selectedItemId = R.id.temp

        binding.mainBottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_enter -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, EnterFragment())
                        .addToBackStack(null)
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.nav_show -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, ShowFragment())
                        .addToBackStack(null)
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                else -> false
            }
        }
    }

    override fun onBackPressed() {
        // 현재 표시된 프래그먼트가 HomeFragment가 아닌 경우에만 백스택을 비웁니다.
        val fragment = supportFragmentManager.findFragmentById(R.id.main_frm)
        if (fragment !is HomeFragment) {
            // 백스택을 모두 비우고 HomeFragment로 돌아갑니다.
            supportFragmentManager.popBackStack(null, androidx.fragment.app.FragmentManager.POP_BACK_STACK_INCLUSIVE)
            supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm, HomeFragment())
                .commitAllowingStateLoss()
            binding.mainBottomNav.selectedItemId = R.id.temp
        } else {
            // HomeFragment가 표시된 경우 기본 동작 (앱 종료)을 수행합니다.
            super.onBackPressed()
        }
    }
}