package com.example.myappmovieticketbooking.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myappmovieticketbooking.R
import com.example.myappmovieticketbooking.data.DataTinTuc
import com.google.android.material.imageview.ShapeableImageView


class AdapterTinTuc(private val listTinTuc: ArrayList<DataTinTuc>): RecyclerView.Adapter<AdapterTinTuc.TinTucHolder>() {
    inner class TinTucHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageTT : ShapeableImageView = itemView.findViewById(R.id.imgTinTuc)
        val titleTT : TextView = itemView.findViewById(R.id.tvTitleTinTuc)
        val dateTT : TextView = itemView.findViewById(R.id.tvDateTimeTT)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TinTucHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.listtintuc,parent,false)
        return TinTucHolder(view)
    }

    override fun onBindViewHolder(holder: TinTucHolder, position: Int) {
        val currentItem = listTinTuc[position]

        holder.imageTT.setImageResource(currentItem.image)
        holder.titleTT.text = currentItem.title
        holder.dateTT.text = currentItem.datetime

    }

    override fun getItemCount(): Int {
        return listTinTuc.size
    }
}