package com.rne1223.myfixster2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


private const val API_KEY = BuildConfig.API_KEY

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}