package com.example.parcialtp3.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.parcialtp3.R
import com.example.parcialtp3.SecondaryActivity

class SplashFragment : Fragment() {

    lateinit var vista: View
    lateinit var btnMainSplash: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_splash, container, false)

        btnMainSplash = vista.findViewById(R.id.btnSplash)

        return vista
    }

    override fun onStart() {
        super.onStart()

        btnMainSplash.setOnClickListener {
            var intentNav = Intent( activity, SecondaryActivity::class.java )
            startActivity(intentNav)

            activity?.finish()
        }
    }

}