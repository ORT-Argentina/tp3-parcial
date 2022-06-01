package com.example.parcialgrupo2.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.parcialgrupo2.R

class SplashFragment : Fragment() {
    private lateinit var v: View
    private lateinit var splashButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_splash, container, false)

        splashButton = v.findViewById(R.id.splash_button)

        return v
    }

    override fun onStart() {
        super.onStart()
        splashButton.setOnClickListener {
            val action = SplashFragmentDirections.actionSplashFragmentToLoginFragment()
            v.findNavController().navigate(action)
        }
    }
}