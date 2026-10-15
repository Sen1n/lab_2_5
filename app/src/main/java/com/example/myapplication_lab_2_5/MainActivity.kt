package com.example.myapplication_lab_2_5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        UserTracker.register(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        UserTracker.unregister(this)
    }
}