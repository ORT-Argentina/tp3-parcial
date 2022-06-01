package com.example.examenkotlin.entities

class Notification (name: String?, date: String?) {
    var name:String = ""
    var date:String = ""

    init {
        this.name = name!!
        this.date = date!!

    }
}