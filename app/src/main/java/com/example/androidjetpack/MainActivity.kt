package com.example.androidjetpack

import android.content.SharedPreferences
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.edit
import androidx.core.net.toUri

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // android ktx
        val uri = Uri.parse("")
        val u = "".toUri()
        val sharedPreferences = getSharedPreferences("", 0)
        sharedPreferences.edit {
            putBoolean("key", true)
        }

    }
}
