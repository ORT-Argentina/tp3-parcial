package com.example.parcialgrupo2.entities

import android.os.Parcel
import android.os.Parcelable

class Notification(text: String?, mins: Int?) {
    var description: String
    var minutes: Int

    init {
        this.description = text ?: ""
        this.minutes = mins ?: 0
    }
}