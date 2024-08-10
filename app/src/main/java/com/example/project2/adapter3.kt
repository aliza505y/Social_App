/*
package com.project2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.project2.R
import com.google.android.material.imageview.ShapeableImageView

class adapter3(var gridlist:ArrayList<dataclass1>):
        RecyclerView.Adapter<adapter3.MyViewHolder>(){

            inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
                val gridimage:ShapeableImageView=itemView.findViewById(R.id.imageView5)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter3.MyViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(
            R.layout.griddesign3
            parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: adapter3.MyViewHolder, position: Int) {
        val currentItem=gridlist[position]
         holder.gridimage.setImageResource(currentItem.grid)
    }

    override fun getItemCount(): Int {
         return gridlist.size
    }

     }*/


package com.example.project2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.example.project2.dataclass3


class adapter3(var gridlist: ArrayList<dataclass3>) :
    RecyclerView.Adapter<adapter3.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gridimage: ShapeableImageView = itemView.findViewById(R.id.imageView5)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter3.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.griddesign3,
            parent, false
        )
        return MyViewHolder(itemView)
        // reactangle images kes activity my use ke hain??
    }

    override fun onBindViewHolder(holder: adapter3.MyViewHolder, position: Int) {
        val currentItem = gridlist[position]
        holder.gridimage.setImageResource(currentItem.grid)
    }

    override fun getItemCount(): Int {
        return gridlist.size
    }
}

