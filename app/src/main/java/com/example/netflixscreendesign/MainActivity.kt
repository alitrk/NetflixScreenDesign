package com.example.netflixscreendesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.netflixscreendesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list1 = ArrayList<Contents>()
        val c1 = Contents("money_heist")
        val c2 = Contents("stranger_things")
        val c3 = Contents("witcher")
        val c4 = Contents("altered_carbon")

        list1.add(c1)
        list1.add(c2)
        list1.add(c3)
        list1.add(c4)

        val list2 = ArrayList<Contents>()
        val c5 = Contents("better_call_saul")
        val c6 = Contents("dahmer")
        val c7 = Contents("daredevil")
        val c8 = Contents("gray_man")

        list2.add(c5)
        list2.add(c6)
        list2.add(c7)
        list2.add(c8)

        val list3 = ArrayList<Contents>()
        val c9 = Contents("devilman_crybaby")
        val c10 = Contents("ozark")
        val c11 = Contents("blacklist")
        val c12 = Contents("thirteen_reasons_why")

        list3.add(c9)
        list3.add(c10)
        list3.add(c11)
        list3.add(c12)

        binding.rv1.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.rv2.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.rv3.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        val adapter1 = ContentAdapter(this,list1)
        binding.rv1.adapter = adapter1

        val adapter2 = ContentAdapter(this,list2)
        binding.rv2.adapter = adapter2

        val adapter3 = ContentAdapter(this,list3)
        binding.rv3.adapter = adapter3

    }
}