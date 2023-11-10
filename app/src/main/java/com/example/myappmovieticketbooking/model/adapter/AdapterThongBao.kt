package com.example.myappmovieticketbooking.model.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myappmovieticketbooking.R
import com.example.myappmovieticketbooking.model.data.DataThongBao
import com.google.android.material.imageview.ShapeableImageView

class AdapterThongBao(private var listTB : List<DataThongBao>, private val onClickImage : ThongBaoInterface) : RecyclerView.Adapter<AdapterThongBao.ThongBaoHolder>() {
    interface ThongBaoInterface{
        fun onClick(position: Int){

        }

    }
    inner class ThongBaoHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageTB : ShapeableImageView = itemView.findViewById(R.id.imgTB)
        val titleTB : TextView = itemView.findViewById(R.id.tvTitleTB)
        val dateTB : TextView = itemView.findViewById(R.id.tvDateTB)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThongBaoHolder {
        val viewTB = LayoutInflater.from(parent.context).inflate(R.layout.listthongbao,parent,false)
        return ThongBaoHolder(viewTB)
    }

    override fun onBindViewHolder(holder: ThongBaoHolder, position: Int) {
        val currentItem = listTB[position]

        holder.imageTB.setImageResource(currentItem.imageTB)
        holder.titleTB.text = currentItem.titleTB
        holder.dateTB.text = currentItem.datetimeTB

        holder.imageTB.setOnClickListener {
            onClickImage.onClick(position)
        }
    }

    override fun getItemCount(): Int {
        return listTB.size
    }
}