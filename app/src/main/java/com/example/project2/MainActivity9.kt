package com.example.project2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.project2.R
import com.google.android.material.button.MaterialButton

class MainActivity9:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        val set8= findViewById<MaterialButton>(R.id.materialbutton6)
        set8.setOnClickListener {
            val intent= Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }
    }
}