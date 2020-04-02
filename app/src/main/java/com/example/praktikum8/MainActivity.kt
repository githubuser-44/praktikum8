package com.example.praktikum8

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pratikum8.ViewPageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view_pager.adapter = ViewPageAdapter(
            this, supportFragmentManager
        )
        tabs.setupWithViewPager(view_pager)
    }
}