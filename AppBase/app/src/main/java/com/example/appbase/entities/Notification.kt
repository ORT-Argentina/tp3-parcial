package com.example.appbase.entities

class Notification (text: String?, minutes: Int?){
    var text: String = ""
    var minutes: Int = 0

    init {
        this.text = text !!
        this.minutes = minutes !!
    }

}