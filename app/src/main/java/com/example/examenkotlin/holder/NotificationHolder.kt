package com.example.examenkotlin.holder

import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.examenkotlin.R

class NotificationHolder (v: View) : RecyclerView.ViewHolder(v){
    private var view: View

    init{
        this.view = v
    }

    fun setName(name: String){
        val txt: TextView = view.findViewById(R.id.notification_text)
        txt.text = name
    }
    fun setDate(date: String){
        val datetxt: TextView = view.findViewById(R.id.date_text)
        datetxt.text = date
    }

}