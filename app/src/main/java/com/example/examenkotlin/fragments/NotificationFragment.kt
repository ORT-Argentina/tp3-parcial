package com.example.examenkotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.examenkotlin.R
import com.example.examenkotlin.activities.StartActivity
import com.example.examenkotlin.adapter.NotificationAdapter
import com.example.examenkotlin.entities.Notification
import com.google.android.material.snackbar.Snackbar

class NotificationFragment : Fragment() {

    private lateinit var viewNotifications: View
    private lateinit var notificationRecyclerView: RecyclerView
    private var notifications: MutableList<Notification> = ArrayList<Notification>()
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var notificationListAdapter: NotificationAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        if (activity != null) {
            (activity as StartActivity).supportActionBar?.title = "Notificaciones"
        }
        viewNotifications = inflater.inflate(R.layout.fragment_notification, container, false)
        notificationRecyclerView = viewNotifications.findViewById(R.id.recycler_view_notifications)
        return viewNotifications
    }

    override fun onStart() {
        super.onStart()

        notifications.add(
                Notification(
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ",
                    "21-12-22"
                )
            )
        notifications.add(
                Notification(
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ",
                    "21-12-22"
                )
            )
        notifications.add(
                Notification(
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ",
                    "21-12-22"
                )
            )
        notifications.add(
                Notification(
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ",
                    "21-12-22"
                )
            )
        notifications.add(
                Notification(
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ",
                    "21-12-22"
                )
            )
        notifications.add(
                Notification(
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ",
                    "21-12-22"
                )
            )

        notificationRecyclerView.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(context)
        notificationRecyclerView.layoutManager = linearLayoutManager

        notificationListAdapter = NotificationAdapter(notifications) { x ->
            onItemClick(x)
        }

        notificationRecyclerView.adapter = notificationListAdapter

    }

    private fun onItemClick(position: Int):Boolean{
        Snackbar.make(viewNotifications, position.toString(), Snackbar.LENGTH_SHORT).show()
        return true
    }

}