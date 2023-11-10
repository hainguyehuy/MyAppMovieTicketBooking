package com.example.myappmovieticketbooking.model

import com.example.myappmovieticketbooking.R
import com.example.myappmovieticketbooking.model.data.DataTrangChu

class MoviesDataProvider {
    private val movies = arrayListOf<DataTrangChu>()

    init {
        movies.add(DataTrangChu(R.drawable.anh1,"MovieName"))
        movies.add(DataTrangChu(R.drawable.anh2,"MovieName"))
        movies.add(DataTrangChu(R.drawable.anh3,"MovieName"))
        movies.add(DataTrangChu(R.drawable.anh4,"MovieName"))
        movies.add(DataTrangChu(R.drawable.anh5,"MovieName"))
        movies.add(DataTrangChu(R.drawable.anh6,"MovieName"))
        movies.add(DataTrangChu(R.drawable.anh7,"MovieName"))
        movies.add(DataTrangChu(R.drawable.anh8,"MovieName"))
        movies.add(DataTrangChu(R.drawable.anh9,"MovieName"))
        movies.add(DataTrangChu(R.drawable.anh10,"MovieName"))
    }
    fun getMoives() = movies
}