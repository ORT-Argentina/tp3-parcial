package com.example.examenkotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.recyclerview.widget.RecyclerView
import com.example.examenkotlin.R
import com.example.examenkotlin.entities.Notification
import com.example.examenkotlin.holder.NotificationHolder

class NotificationAdapter (

    private  var eventList: MutableList<Notification>,
    val onItemClick:(Int) -> Boolean
) : RecyclerView.Adapter<NotificationHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.notification_item, parent, false)
        return (NotificationHolder(view))
    }

    fun setData(newData: ArrayList<Notification>) {
        this.eventList = newData
        this.notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: NotificationHolder, position: Int) {
        holder.setName(eventList[position].name)
        holder.setDate(eventList[position].date)
    }

    override fun getItemCount(): Int {
        return eventList.size
    }

}