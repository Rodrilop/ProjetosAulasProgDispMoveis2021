package com.rodrigo.shortbio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnAbout : Button
    private lateinit var btnEducation : Button
    private lateinit var btnExperiences : Button
    private lateinit var btnGoals : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAbout = findViewById(R.id.btnAbout)
        btnEducation = findViewById(R.id.btnEducation)
        btnExperiences = findViewById(R.id.btnExperiences)
        btnGoals = findViewById(R.id.btnGoals)

        btnAbout.setOnClickListener {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        }

        btnEducation.setOnClickListener {
            val intent = Intent(this@MainActivity, EducationActivity::class.java)
            startActivity(intent)
        }

        btnExperiences.setOnClickListener {
            val intent = Intent(this@MainActivity, ExperiencesActivity::class.java)
            startActivity(intent)
        }

        btnGoals.setOnClickListener {
            val intent = Intent(this@MainActivity, GoalsActivity::class.java)
            startActivity(intent)
        }
    }
}