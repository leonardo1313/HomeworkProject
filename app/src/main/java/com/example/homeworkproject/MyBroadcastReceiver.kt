package com.example.homeworkproject

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.TextView
import android.widget.Toast


const val MESSAGE_SENT = "com.sendMessage.Broadcast"
class MyBroadcastReceiver : BroadcastReceiver() {

    private lateinit var messageTv: TextView
    private lateinit var view: View
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null) {
            when (intent.action) {
                MESSAGE_SENT -> {
                        val message = intent.getStringExtra("MESSAGE")

                }
                else -> {
                    Toast.makeText(context, "Message not sent", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}