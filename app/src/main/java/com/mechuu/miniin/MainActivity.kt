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

        binding.mainBottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, HomeFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.nav_rating -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, RatingFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                else -> false
            }
        }
    }
}