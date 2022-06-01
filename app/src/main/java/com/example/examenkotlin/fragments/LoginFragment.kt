package com.example.examenkotlin.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.examenkotlin.R
import com.example.examenkotlin.activities.StartActivity

class LoginFragment : Fragment() {

    private lateinit var viewLogin: View
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewLogin = inflater.inflate(R.layout.fragment_login, container, false)
        btnLogin = viewLogin.findViewById(R.id.buttonLogin)
        return viewLogin
    }

    override fun onStart() {
        super.onStart()
        btnLogin.setOnClickListener {
            val intent = Intent(activity, StartActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }
    }

}