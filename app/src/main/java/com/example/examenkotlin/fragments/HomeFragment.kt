package com.example.examenkotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examenkotlin.R
import com.example.examenkotlin.activities.StartActivity

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if(activity != null){
            (activity as StartActivity).supportActionBar?.title = "Home"
        }
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}