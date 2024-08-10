package com.example.project2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.project2.R

class MainActivity7 :AppCompatActivity(){
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val set6= findViewById<TextView>(R.id.textView16)
        set6.setOnClickListener {
            val intent=Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }

    }
}