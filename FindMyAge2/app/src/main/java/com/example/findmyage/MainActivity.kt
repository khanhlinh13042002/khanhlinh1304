package com.example.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buGetAge: Button = findViewById(R.id.buGetAge)
        buGetAge.setOnClickListener { findAge()}

    }
    fun findAge(){
        val resultAge: TextView = findViewById(R.id.resultAge)
        val etDOB: TextView = findViewById(R.id.etDOB)
        val yearCurent = Integer.parseInt(Calendar.getInstance().get(Calendar.YEAR).toString())
        val birth =Integer.parseInt(etDOB.text.toString())
        val result = yearCurent - birth
        resultAge.text = "Your AGE IS $result YEARS"
    }
}