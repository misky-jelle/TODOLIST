package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBMI:Button
    lateinit var btnmoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBMI = findViewById(R.id.btnBmi)
        btnBMI.setOnClickListener {
            val intent = Intent(this, CalActivity::class.java)
            startActivity(intent)


                }
        btnmoney=findViewById(R.id.btnmoney)
        btnmoney.setOnClickListener {
            val intent= Intent(this,mobilemoneyActivity::class.java)
            startActivity(intent)
        }
            }
        }

