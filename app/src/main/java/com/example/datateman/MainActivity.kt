package com.example.datateman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val menuTeks = arrayOf("Teman", "Github", "Profile")
    val menuIcon = arrayOf(R.drawable.icon_add, R.drawable.icon_home, R.drawable.icon_profile)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(this)
        view_pager.setAdapter(adapter)
        TabLayoutMediator(tab_layout, view_pager,
            TabLayoutMediator.TabConfigurationStrategy {tab, position ->
                tab.text=menuTeks[position]
                tab.icon=ResourcesCompat.getDrawable(resources, menuIcon[position],null)
            }).attach()
    }
}