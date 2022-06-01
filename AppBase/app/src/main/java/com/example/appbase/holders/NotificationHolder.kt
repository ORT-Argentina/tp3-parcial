package com.example.appbase.holders

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.appbase.R

class NotificationHolder (v: View): RecyclerView.ViewHolder(v) {
    private var view: View

    init {
        this.view = v
    }

    fun setText(text: String, textMinutes: String){
        val txt: TextView = view.findViewById(R.id.txt_notification)
        txt.text = text
        val txtMinutes: TextView = view.findViewById(R.id.txt_minutes)
        txtMinutes.text = textMinutes

    }

    fun getCardLayout(): CardView {
        return view.findViewById(R.id.card_notification)
    }
}