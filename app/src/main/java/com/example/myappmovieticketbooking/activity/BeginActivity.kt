package com.example.myappmovieticketbooking.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myappmovieticketbooking.fragment.LichPhimFragment
import com.example.myappmovieticketbooking.R
import com.example.myappmovieticketbooking.fragment.TaikhoanFragment
import com.example.myappmovieticketbooking.fragment.ThongbaoFragment
import com.example.myappmovieticketbooking.fragment.TinTucFragment
import com.example.myappmovieticketbooking.fragment.TrangChuFragment
import com.example.myappmovieticketbooking.databinding.ActivityBeginBinding


class BeginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityBeginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBeginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(TrangChuFragment())

        binding.bottomNavi.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment(TrangChuFragment())
                R.id.newspaper -> replaceFragment(TinTucFragment())
                R.id.calendar -> replaceFragment(LichPhimFragment())
                R.id.notif -> replaceFragment(ThongbaoFragment())
                R.id.profile -> replaceFragment(TaikhoanFragment())

            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.frLayout,fragment)
//        fragmentTransaction.commit()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frLayout,fragment)
            commit()
        }
    }
}