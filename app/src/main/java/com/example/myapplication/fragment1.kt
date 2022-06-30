package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */

class fragment1 : Fragment() {

    lateinit var v: View
    lateinit var btnNavFrag1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        v = inflater.inflate(R.layout.fragment_fragment1, container, false)
        btnNavFrag1 = v.findViewById(R.id.btn1frg1)
        return v
    }

    override fun onStart() {
        super.onStart()

        btnNavFrag1.setOnClickListener{
            val action = fragment1Directions.actionFragment1ToSecond()
            v.findNavController().navigate(action)
            activity?.finish()
        }

    }

}