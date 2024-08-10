package com.example.project2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.project2.R
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        val create=findViewById<MaterialButton>(R.id.materialButton1)
//ye jo create variable bnaya ha ye hr activity mn change name sy hona chahiay?
        // hn
        create.setOnClickListener {
            val intent=Intent(this, Mainactivity2::class.java)
            startActivity(intent)
        }
    }
}
