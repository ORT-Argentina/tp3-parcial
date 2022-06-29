package com.example.parcialtp3.entities

import java.util.*

class FoodPlace (
    var id: Int,
    var name: String,
    var type: String,
    var punctuation: Double,
    var img: String
        ){

    init {
        this.id = id
        this.name = name
        this.type = type
        this.punctuation = punctuation
        this.img = img
    }

}