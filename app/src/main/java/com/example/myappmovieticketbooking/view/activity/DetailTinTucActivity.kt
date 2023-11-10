package com.example.myappmovieticketbooking.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.myappmovieticketbooking.R

class DetailTinTucActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tin_tuc)

        val tvDetailTinTuc: TextView = findViewById(R.id.tvDetailtinTuc)
        val imageDetailTinTuc: ImageView = findViewById(R.id.imageDetailTinTuc)
        val bundle: Bundle? = intent.extras

        val textTitle = bundle!!.getString("titleTinTuc")
        val imageDetail = bundle.getInt("imageTinTuc")

        tvDetailTinTuc.text = textTitle
        imageDetailTinTuc.setImageResource(imageDetail)


    }
}