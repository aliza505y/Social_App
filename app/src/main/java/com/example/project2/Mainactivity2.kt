package com.example.project2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.project2.MainActivity3
import com.example.project2.R
import com.google.android.material.button.MaterialButton

class Mainactivity2:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val set1 = findViewById<MaterialButton>(R.id.materialButton)
        set1.setOnClickListener {
            val intent=Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}