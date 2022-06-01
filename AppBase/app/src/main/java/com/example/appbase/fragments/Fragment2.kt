package com.example.appbase.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appbase.R
import com.example.appbase.adapters.NotificacionListAdapter
import com.example.appbase.entities.Notification


class Fragment2 : Fragment() {

    lateinit var v: View
    lateinit var recNotification : RecyclerView
    var notifications : MutableList<Notification> = ArrayList<Notification>()
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var notificationListAdapter: NotificacionListAdapter

    companion object {
        fun newInstance() = Fragment2()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_2, container, false)
        recNotification = v.findViewById(R.id.rec_notification)
        return v
    }

    override fun onStart() {
        super.onStart()
        for(i in 1..16){
            notifications.add(Notification("Lorem Ipsum is simply dummy text\n" +
                    "of the printing and typesetting industry.", 2))
        }

        recNotification.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(context)
        recNotification.layoutManager = linearLayoutManager

        notificationListAdapter = NotificacionListAdapter(notifications)

        recNotification.adapter = notificationListAdapter
    }



}