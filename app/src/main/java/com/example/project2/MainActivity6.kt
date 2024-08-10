package com.example.project2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.project2.R
import com.google.android.material.button.MaterialButton

class MainActivity6 :AppCompatActivity(){
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val set5= findViewById<MaterialButton>(R.id.materialButton4)
        set5.setOnClickListener {
            val intent=Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }
    }
}