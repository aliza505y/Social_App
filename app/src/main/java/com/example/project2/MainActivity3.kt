/*package com.project2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project2.R
import com.example.project2.dataclass3

class MainActivity3:AppCompatActivity(){

    private lateinit var gridarraylist:ArrayList<dataclass3>
    private lateinit var adapter:adapter3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

    val recyclerView=findViewById<RecyclerView>(R.id.recyclerview3)

         gridarraylist=Arraylist<dataclass3>
    gridarraylist.add(dataclass3(R.drawable.rectangle1))
    gridarraylist.add(dataclass3(R.drawable.rectangle2))
    gridarraylist.add(dataclass3(R.drawable.rectangle3))
    gridarraylist.add(dataclass3(R.drawable.rectangle2))
    gridarraylist.add(dataclass3(R.drawable.rectangle1))

    adapter=adapter3(gridarraylist)
        recyclerView.layoutManager=GridLayoutManager(this)
        recyclerView.adapter=adapter

}
}*/
package com.example.project2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project2.MainActivity4
import com.example.project2.dataclass3

class MainActivity3 : AppCompatActivity() {

    private lateinit var gridarraylist: ArrayList<dataclass3>
    private lateinit var adapter: adapter3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview3)

        gridarraylist = ArrayList()

        gridarraylist.add(dataclass3(R.drawable.img1))
        gridarraylist.add(dataclass3(R.drawable.img2))
        gridarraylist.add(dataclass3(R.drawable.img1))
        gridarraylist.add(dataclass3(R.drawable.img2))
        gridarraylist.add(dataclass3(R.drawable.img1))
        gridarraylist.add(dataclass3(R.drawable.img2))
        gridarraylist.add(dataclass3(R.drawable.img2))


        adapter = adapter3(gridarraylist)
        recyclerView.layoutManager = GridLayoutManager(this, 3)
        recyclerView.adapter = adapter

        @SuppressLint("SuspiciousIndentation")
        val set2=findViewById<TextView>(R.id.textview14)
        set2.setOnClickListener {
            val intent=Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}