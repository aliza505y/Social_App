package com.example.project2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project2.R
import com.google.android.material.imageview.ShapeableImageView

class adapter1 (var linerlist:ArrayList<dataclass1>):
        RecyclerView.Adapter<adapter1.MyViewHolder>() {

inner  class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    val userimage:ShapeableImageView=itemView.findViewById(R.id.imageView3)
    val namee :TextView=itemView.findViewById(R.id.textView9)
    val agee :TextView=itemView.findViewById(R.id.textView10)
}


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(
            R.layout.lineardesign4,
            parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
           val currentItem=linerlist[position]
           holder.userimage.setImageResource(currentItem.userimage)
           holder.namee.text=currentItem.name
           holder.agee.text=currentItem.age

    }

    override fun getItemCount(): Int {
        return linerlist.size
    }

}