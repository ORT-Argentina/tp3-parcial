package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import com.example.myapplication.R

class HomeFragment : Fragment() {

    lateinit var constraint1: ConstraintLayout
    lateinit var constraint2: ConstraintLayout
    lateinit var constraint3: ConstraintLayout
    lateinit var listView: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        listView = inflater.inflate(R.layout.fragment_home, container, false)
        constraint1 = listView.findViewById(R.id.constraintLayout)
        constraint2 = listView.findViewById(R.id.constraintLayout2)
        constraint3 = listView.findViewById(R.id.constraintLayout3)
        return listView
    }

    override fun onStart() {
        super.onStart()
        constraint1.setOnClickListener {
            var action = HomeFragmentDirections.actionHomeFragmentToOrderFragment()
            listView.findNavController().navigate(action)
        }
        constraint2.setOnClickListener {
            var action = HomeFragmentDirections.actionHomeFragmentToOrderFragment()
            listView.findNavController().navigate(action)
        }
        constraint3.setOnClickListener {
            var action = HomeFragmentDirections.actionHomeFragmentToOrderFragment()
            listView.findNavController().navigate(action)
        }
    }

}