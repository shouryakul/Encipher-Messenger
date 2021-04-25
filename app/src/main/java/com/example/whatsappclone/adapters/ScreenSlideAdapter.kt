package com.example.whatsappclone.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.whatsappclone.fragments.ChatsFragment
import com.example.whatsappclone.fragments.PeopleFragment

class ScreenSlideAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    private val NUM_PAGES: Int = 2
    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int): Fragment= when(position){
        0 -> ChatsFragment()
        else -> PeopleFragment()
    }

}