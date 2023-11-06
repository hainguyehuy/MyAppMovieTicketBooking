package com.example.myappmovieticketbooking.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.myappmovieticketbooking.R

class DetailTinTucActivity : AppCompatActivity() {
    var tvDetailtinTuc: TextView = findViewById(R.id.tvDetailtinTuc)
    var imageDetailTinTuc: ImageView = findViewById(R.id.imageDetailTinTuc)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tin_tuc)

        val bundle: Bundle? = intent.extras

        val textTitle = bundle!!.getString("titletinTuc")
        val imageDetail = bundle.getInt("imageTinTuc")

        tvDetailtinTuc.text = textTitle
        imageDetailTinTuc.setImageResource(imageDetail)


    }
}