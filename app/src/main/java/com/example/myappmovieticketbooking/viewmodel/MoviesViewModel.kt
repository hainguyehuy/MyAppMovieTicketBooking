package com.example.myappmovieticketbooking.viewmodel

import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myappmovieticketbooking.model.MoviesDataProvider
import com.example.myappmovieticketbooking.model.data.DataTrangChu
import java.util.logging.Handler

class MoviesViewModel : ViewModel() {
    private val movieData = MutableLiveData<DataTrangChu>()
    private val movies = MoviesDataProvider().getMoives()
    private var currentIndex = 0
    private val delay = 3000L

    init {
        loopMovies()
    }

    fun getMoviesData() : LiveData<DataTrangChu> = movieData
    fun updateMovies(){
        currentIndex++
        currentIndex %= movies.size

        movieData.value = movies[currentIndex]
        loopMovies()
    }

    private fun loopMovies() {
        android.os.Handler(Looper.getMainLooper()).postDelayed({updateMovies()},delay)
    }
}