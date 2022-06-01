package com.example.parcialgrupo2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialgrupo2.R
import com.example.parcialgrupo2.adapters.NotificationsListAdapter
import com.example.parcialgrupo2.entities.Notification

class NotificationsFragment : Fragment() {
    private lateinit var v: View
    private lateinit var recyclerNotifications: RecyclerView
    private var notifications: MutableList<Notification> = ArrayList()
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var notificationsListAdapter: NotificationsListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        requireActivity().title = "Notifications"

        v = inflater.inflate(R.layout.fragment_notifications, container, false)

        recyclerNotifications = v.findViewById(R.id.recycler_view)

        return v
    }

    override fun onStart() {
        super.onStart()
        for (i in 1..5) {
            notifications.add(Notification("Lorem Ipsum is simply dummy text of the printing and typesetting industry.", 20))
            notifications.add(Notification("Lorem Ipsum is simply dummy text of the printing and typesetting industry.", 20))
            notifications.add(Notification("Lorem Ipsum is simply dummy text of the printing and typesetting industry.", 20))
        }

        notificationsListAdapter = NotificationsListAdapter(notifications)

        recyclerNotifications.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(context)
        recyclerNotifications.layoutManager = linearLayoutManager

        recyclerNotifications.adapter = notificationsListAdapter
    }
}