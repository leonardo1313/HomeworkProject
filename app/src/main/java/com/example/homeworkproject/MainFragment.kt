package com.example.homeworkproject

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.localbroadcastmanager.content.LocalBroadcastManager

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {

    //var localBroadcastManager = context?.let { LocalBroadcastManager.getInstance(it) }
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var messageInput: EditText
    private lateinit var sendMessageBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onStart() {
        super.onStart()
        view?.let {
                messageInput = it.findViewById(R.id.message_input_et)
                sendMessageBtn = it.findViewById(R.id.send_message_btn)
        }
        sendMessageBtn.setOnClickListener {
            if (messageInput.text.isNotEmpty()) {
                sendMessage()
            }
            else {
                Toast.makeText(context, "Please enter message.", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)

    }


    private fun sendMessage() {
        val localBroadcastIntent = Intent(MESSAGE_SENT).apply {
            putExtra("MESSAGE_KEY", messageInput.text.toString())
        }
        LocalBroadcastManager.getInstance(requireContext()).sendBroadcast(localBroadcastIntent)
    }
}