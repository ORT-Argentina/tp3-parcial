package com.example.parcialgrupo2.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.parcialgrupo2.R
import com.example.parcialgrupo2.activities.ContainerActivity
import com.example.parcialgrupo2.activities.MainActivity

class LoginFragment : Fragment() {
    private lateinit var v: View
    private lateinit var loginButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_login, container, false)
        loginButton = v.findViewById(R.id.login_button)
        return v
    }


    override fun onStart() {
        super.onStart()
        loginButton.setOnClickListener {
            val intent = Intent (activity, ContainerActivity::class.java)
            activity?.startActivity(intent)
        }
    }
}