package com.rne1223.myfixster2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView


//private const val API_KEY = BuildConfig.API_KEY

class MainActivity : AppCompatActivity() {

    private lateinit var moviesRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the recycler viewer from xml
        moviesRecyclerView = findViewById<RecyclerView>(R.id.moviesRecyclerView)

        Log.v("MainActivity", "Testing")

    }
}