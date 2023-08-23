package com.example.homeworkproject

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var toolbar: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager)
        viewPager.adapter = ViewPagerAdapter(this)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Homework App"

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.exit_icon, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.exit_icon -> displayAlertDialog()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun displayAlertDialog() {
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setTitle("Exit")
        dialogBuilder.setMessage("Are you sure you want to exit the app?")

        dialogBuilder.setPositiveButton("Yes") { dialog, which ->
            finishAffinity()
        }
        dialogBuilder.setNegativeButton("No") { dailog, which ->

        }

        val dialog = dialogBuilder.create()
        dialog.show()
    }

}