package com.example.leksus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.leks.R
import com.example.leksus.adapter.ViewPagerFragmentsAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var viewpagersecond: ViewPager2
    private  lateinit var tablayout : TabLayout
    private lateinit var viewPagerFragmentsAdapter: ViewPagerFragmentsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpagersecond.adapter = viewPagerFragmentsAdapter
        init()
        viewpagersecond.adapter = viewPagerFragmentsAdapter
        TabLayoutMediator(tablayout,viewpagersecond) { tab,position ->
            when(position){
                0 -> tab.text = "notes"
                1 -> tab.text = "nature"
                2 -> tab.text = "nature"
            }


        }.attach()





    }
    private fun init(){
        viewpagersecond = findViewById(R.id.viewpagersecond)
        tablayout = findViewById(R.id.tablayout)
        viewPagerFragmentsAdapter = ViewPagerFragmentsAdapter(this)
    }

}