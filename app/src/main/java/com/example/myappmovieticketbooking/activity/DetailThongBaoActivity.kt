package com.example.myappmovieticketbooking.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.widget.ImageViewCompat
import com.example.myappmovieticketbooking.R

class DetailThongBaoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_thong_bao)

        val tvDetailTB : TextView = findViewById(R.id.tvDetailTB)
        val imageDetailTB : ImageView = findViewById(R.id.imageDetailTB)

        val bundle : Bundle? = intent.extras

        val tvTB = bundle!!.getString("titleTB")
        val imgTB = bundle.getInt("imageTB")

        tvDetailTB.text = tvTB
        imageDetailTB.setImageResource(imgTB)
    }
}