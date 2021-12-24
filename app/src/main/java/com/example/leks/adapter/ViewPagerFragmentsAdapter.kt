package com.example.leksus.adapter

import android.app.Activity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.leks.Fragments.SecondFrag
import com.example.leks.Fragments.ThirdFrag
import com.example.leksus.Frangments.FirstFrag


class ViewPagerFragmentsAdapter(activity:FragmentActivity):FragmentStateAdapter(activity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return  when(position){
            0-> FirstFrag()
            1-> SecondFrag()
            2-> ThirdFrag()
            else -> SecondFrag()
        }
    }
}