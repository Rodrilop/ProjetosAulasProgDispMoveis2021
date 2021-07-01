package com.rodrigo.shortbio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    private lateinit var btnHome : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        btnHome = findViewById(R.id.btnHomeAbout)

        btnHome.setOnClickListener {
            val intent = Intent(this@AboutActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}