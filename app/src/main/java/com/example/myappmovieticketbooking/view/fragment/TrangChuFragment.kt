package com.example.myappmovieticketbooking.view.fragment

import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.myappmovieticketbooking.R
import com.example.myappmovieticketbooking.databinding.FragmentTrangChuBinding
import com.example.myappmovieticketbooking.viewmodel.MoviesViewModel


class TrangChuFragment : Fragment() {
    private val viewModel : MoviesViewModel by viewModels()
    private lateinit var binding: FragmentTrangChuBinding
//    private val imgMovies : ImageView = findViewById(R.id.imgMoviesTC)
//    private val titleMovies : TextView = findViewById(R.id.tvTitleMoviesTC)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTrangChuBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onResume() {
        super.onResume()
        viewModel.getMoviesData().observe(this, Observer { movie ->
            binding.imgMoviesTC.setImageDrawable(
                ResourcesCompat.getDrawable(resources,movie.imageTC,activity?.theme)
            )
            binding.tvTitleMoviesTC.text = movie.titleTC
        })
    }
}