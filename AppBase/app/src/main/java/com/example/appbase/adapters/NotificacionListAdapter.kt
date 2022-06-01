package com.example.appbase.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appbase.R
import com.example.appbase.entities.Notification
import com.example.appbase.holders.NotificationHolder

class NotificacionListAdapter(
    private var notificationList: MutableList<Notification>,
):  RecyclerView.Adapter<NotificationHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_notification, parent, false)
        return (NotificationHolder(view))
    }

    override fun getItemCount(): Int {
        return notificationList.size
    }

    fun setData(newData: ArrayList<Notification>) {
        this.notificationList = newData
        this.notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: NotificationHolder, position: Int) {
        var notification = notificationList[position]
        var textMinutes = notification.minutes.toString()+" min"
        holder.setText(notification.text, textMinutes)

       /* holder.getCardLayout().setOnClickListener{ //para cuando se toque un elemento de la lista se corra la funcion
            onItemClick(position)
        }*/
    }
}