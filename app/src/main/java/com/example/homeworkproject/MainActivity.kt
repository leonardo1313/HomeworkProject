package com.example.homeworkproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {

    private val fragmentManager = supportFragmentManager

    override fun onStart() {
        super.onStart()

        fragmentManager.commit {
            add(R.id.fragment_container, MainFragment())
            addToBackStack(null)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

}