package com.example.homeworkproject

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

const val MESSAGE_SENT = "com.sendmessage.Broadcast"
class MyBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null) {
            when (intent.action) {
                MESSAGE_SENT -> {

                }

                else -> {}
            }
        }
    }
}