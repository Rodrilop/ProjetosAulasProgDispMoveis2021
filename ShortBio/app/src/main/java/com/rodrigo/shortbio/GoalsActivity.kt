package com.rodrigo.shortbio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GoalsActivity : AppCompatActivity() {
    private lateinit var btnHome : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goals)

        btnHome = findViewById(R.id.btnHomeGoals)

        btnHome.setOnClickListener {
            val intent = Intent(this@GoalsActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}