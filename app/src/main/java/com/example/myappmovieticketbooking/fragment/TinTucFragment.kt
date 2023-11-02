package com.example.myappmovieticketbooking.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myappmovieticketbooking.R
import com.example.myappmovieticketbooking.adapter.AdapterTinTuc
import com.example.myappmovieticketbooking.data.DataTinTuc

/**
 * A simple [Fragment] subclass.
 * Use the [TinTucFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TinTucFragment : Fragment() {
    private lateinit var adapterTinTuc: AdapterTinTuc
    private lateinit var listTinTuc : ArrayList<DataTinTuc>
    lateinit var imageId : Array<Int>
    lateinit var titleTT : Array<String>
    lateinit var dateTT : Array<String>
    lateinit var recycleViewTinTuc : RecyclerView
        override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tin_tuc,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycleViewTinTuc = view.findViewById(R.id.ryvTinTuc)
        dataInit()
        recycleViewTinTuc.adapter = AdapterTinTuc(listTinTuc)
        recycleViewTinTuc.layoutManager = LinearLayoutManager(context)
        recycleViewTinTuc.setHasFixedSize(true)
    }

    private fun dataInit() {
        listTinTuc = arrayListOf<DataTinTuc>()
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
            R.drawable.anh10
        )
        titleTT = arrayOf(
            "Là 1 bộ phim rất hay",
            "Là 1 bộ phim rất hay",
            "Là 1 bộ phim rất hay",
            "Là 1 bộ phim rất hay",
            "Là 1 bộ phim rất hay",
            "Là 1 bộ phim rất hay",
            "Là 1 bộ phim rất hay",
            "Là 1 bộ phim rất hay",
            "Là 1 bộ phim rất hay",
            "Là 1 bộ phim rất hay",
        )
        dateTT = arrayOf(
            "1/11/2023",
            "2/11/2023",
            "3/11/2023",
            "4/11/2023",
            "5/11/2023",
            "6/11/2023",
            "7/11/2023",
            "8/11/2023",
            "9/11/2023",
            "10/11/2023",
        )


        for(i in imageId.indices){
            val tintuc = DataTinTuc(imageId[i],titleTT[i],dateTT[i])
            listTinTuc.add(tintuc)
        }

    }
}