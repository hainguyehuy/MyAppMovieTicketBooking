package com.example.myappmovieticketbooking.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myappmovieticketbooking.R
import com.example.myappmovieticketbooking.activity.DetailThongBaoActivity
import com.example.myappmovieticketbooking.adapter.AdapterThongBao
import com.example.myappmovieticketbooking.data.DataThongBao

/**
 * A simple [Fragment] subclass.
 * Use the [ThongbaoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThongbaoFragment : Fragment() {
    private lateinit var adapterThongBao: AdapterThongBao
    private lateinit var listThongBao : ArrayList<DataThongBao>
    private lateinit var imageId : Array<Int>
    private lateinit var titleTB : Array<String>
    private lateinit var dateTB : Array<String>
    private lateinit var recycleViewThongBao : RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_thongbao,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initDataThongBao()
        recycleViewThongBao = view.findViewById(R.id.rcvTB)
        adapterThongBao = AdapterThongBao(listThongBao,object : AdapterThongBao.ThongBaoInterface{
            override fun onClick(position: Int) {
                val intent = Intent(context,DetailThongBaoActivity::class.java)
                intent.putExtra("imageTB",listThongBao[position].imageTB)
                intent.putExtra("titleTB",listThongBao[position].titleTB)
                startActivity(intent)
            }
        })

        recycleViewThongBao.adapter = adapterThongBao
        recycleViewThongBao.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        recycleViewThongBao.setHasFixedSize(true)
    }

    private fun initDataThongBao() {
        listThongBao = arrayListOf<DataThongBao>()
        imageId = arrayOf(
            R.drawable.anh1,
            R.drawable.anh2,
            R.drawable.anh3,
            R.drawable.anh4,
            R.drawable.anh5,
            R.drawable.anh6,
            R.drawable.anh7,
            R.drawable.anh8,
            R.drawable.anh9,
            R.drawable.anh10,
        )
        titleTB = arrayOf(
            "Thông báo này có thể có ích cho bạn đó ^^",
            "Thông báo này có thể có ích cho bạn đó ^^",
            "Thông báo này có thể có ích cho bạn đó ^^",
            "Thông báo này có thể có ích cho bạn đó ^^",
            "Thông báo này có thể có ích cho bạn đó ^^",
            "Thông báo này có thể có ích cho bạn đó ^^",
            "Thông báo này có thể có ích cho bạn đó ^^",
            "Thông báo này có thể có ích cho bạn đó ^^",
            "Thông báo này có thể có ích cho bạn đó ^^",
            "Thông báo này có thể có ích cho bạn đó ^^",
        )
        dateTB = arrayOf(
            "1/12/2023",
            "2/12/2023",
            "3/12/2023",
            "4/12/2023",
            "5/12/2023",
            "6/12/2023",
            "7/12/2023",
            "8/12/2023",
            "9/12/2023",
            "10/12/2023",
        )
        for (i in imageId.indices){
            val thongBao = DataThongBao(imageId[i],titleTB[i],dateTB[i])

            listThongBao.add(thongBao)
        }
    }

}