package com.example.trabajopractico

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SplashViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Splash Fragment"
    }
    val text: LiveData<String> = _text
}