package com.example.animationlist.animation_screens.SpaceTabLayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.animationlist.R
import eu.long1.spacetablayout.SpaceTabLayout

class SpaceTabActivity : AppCompatActivity() {
    var tabLayout: SpaceTabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_space_tab)
        val fragmentList: MutableList<Fragment> = ArrayList()
        fragmentList.add(FragmentOne())
        fragmentList.add(FragmentTwo())
        fragmentList.add(FragmentThree())

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        tabLayout = findViewById(R.id.spaceTabLayout)
        tabLayout!!.initialize(viewPager, supportFragmentManager, fragmentList, null)
    }
}