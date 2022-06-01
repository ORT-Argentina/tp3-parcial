package com.example.trabajopractico.data.recicle


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.trabajopractico.R

class NotificationsAdapter(
    private var notifications: MutableList<Notification>
) : RecyclerView.Adapter<NotificationsAdapter.NotificationHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_item,parent, false)
        return (NotificationHolder(view))
    }

    override fun onBindViewHolder(holder: NotificationHolder, position: Int) {
        holder.setText(notifications[position].text)
    }

    override fun getItemCount() =  notifications.size

    class NotificationHolder (v: View) : RecyclerView.ViewHolder(v){

        private var vista : View

        init{
            this.vista = v
        }

        fun setText(text: String){
            val txtNotificationView: TextView = vista.findViewById(R.id.txt_notification)
            txtNotificationView.text = text
        }


    }

}