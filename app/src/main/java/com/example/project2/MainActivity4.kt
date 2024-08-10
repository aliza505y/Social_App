package com.example.project2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project2.R

class MainActivity4 : AppCompatActivity() {

    private lateinit var linearArrayList:ArrayList<dataclass1>
    private lateinit var adapter: adapter1

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview1)

        linearArrayList= ArrayList()

        linearArrayList.add(dataclass1(R.drawable.photo,"Indrawan Lisanto","21 Yo"))
        linearArrayList.add(dataclass1(R.drawable.photo,"Indrawan Lisanto","21 Yo"))
        linearArrayList.add(dataclass1(R.drawable.photo,"Indrawan Lisanto","21 Yo"))

        adapter= adapter1(linearArrayList)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=adapter

        @SuppressLint("SuspiciousIndentation")
        val set3= findViewById<TextView>(R.id.textView15)
        set3.setOnClickListener {
          val intent=Intent(this, MainActivity5::class.java)
          startActivity(intent)
        }

    }

}