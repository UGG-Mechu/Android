package com.mechuu.miniin

import android.app.Application

class AppData : Application() {
    companion object {
        var questionCount = 0
    }

    override fun onCreate() {
        super.onCreate()
    }
}