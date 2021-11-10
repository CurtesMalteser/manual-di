package com.curtesmalteser.manualdi.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.curtesmalteser.manualdi.R
import com.curtesmalteser.manualdi.application.App

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val container = (application as App).appContainer.userRepository
        Log.d(this::class.java.name, "onCreate: $container")
    }
}