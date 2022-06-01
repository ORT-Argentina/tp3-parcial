package com.example.parcialgrupo2.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.parcialgrupo2.R
class HomeFragment : Fragment() {
    private lateinit var v: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)

        requireActivity().title = "Home"

        v = inflater.inflate(R.layout.fragment_home, container, false)

        return v
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.home_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}