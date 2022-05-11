package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sendmoneyactivity : AppCompatActivity() {
        lateinit var btnsend: Button
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            btnsend.setOnClickListener {
                val intent = Intent(this, CalActivity::class.java)
                startActivity(intent)

            }
        }
    }
