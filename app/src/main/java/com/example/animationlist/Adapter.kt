package com.example.animationlist

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.animationlist.animation_screens.ShimmerLayoutActivity

class Adapter(private var info : ArrayList<AnimationInfoList>,private var navigate: Navigate) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
//        var image : TextView = itemView.findViewById(R.id.imageView)
        var name : TextView = itemView.findViewById(R.id.name)
        var discrip : TextView = itemView.findViewById(R.id.discription)
        var detailDescrip : TextView = itemView.findViewById(R.id.detailDiscription)
//        var infoBut : Button = itemView.findViewById(R.id.infoButton)
        var animation : MotionLayout = itemView.findViewById(R.id.animationAdapter)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.animation_items, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.setText(info[position].name)
        holder.discrip.setText(info[position].discription)
        holder.detailDescrip.setText(info[position].detailDiscirp)

        holder.animation.setOnClickListener {
            holder.animation.transitionToState(R.id.end)
           navigate.navigateTo()
        }
    }

    override fun getItemCount(): Int {
        return info.size
    }
}