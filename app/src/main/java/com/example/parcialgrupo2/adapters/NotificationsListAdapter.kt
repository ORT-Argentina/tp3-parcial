package com.example.parcialgrupo2.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialgrupo2.R
import com.example.parcialgrupo2.entities.Notification
import com.example.parcialgrupo2.holders.NotificationHolder

class NotificationsListAdapter(
    private var notificationsList: MutableList<Notification>,
) : RecyclerView.Adapter<NotificationHolder>() {

    override fun getItemCount(): Int {
        return notificationsList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.notification_item, parent, false)
        return (NotificationHolder(view))
    }

    override fun onBindViewHolder(holder: NotificationHolder, position: Int) {

        holder.setName(notificationsList[position].description)

    }

    fun setData(newData: ArrayList<Notification>) {
        this.notificationsList = newData
        this.notifyDataSetChanged()
    }
}

