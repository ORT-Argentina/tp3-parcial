package com.example.examenkotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.examenkotlin.R

class SplashFragment : Fragment() {

    private lateinit var viewSplash : View
    private lateinit var btnIngresar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewSplash = inflater.inflate(R.layout.fragment_splash, container, false)
        btnIngresar = viewSplash.findViewById(R.id.buttonSplash)
        return viewSplash
    }

    override fun onStart() {
        super.onStart()
        val action1 = SplashFragmentDirections.actionSplashFragmentToLoginFragment()
        viewSplash.findNavController().navigate(action1)
    }

}