package com.hfors.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fm:FragmentManager,lifecycle: Lifecycle,list:ArrayList<Fragment>):FragmentStateAdapter(fm,lifecycle) {
    val fragmentList = list
    override fun getItemCount(): Int = fragmentList.size

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}