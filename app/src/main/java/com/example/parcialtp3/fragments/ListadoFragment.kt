package com.example.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialtp3.adapters.ListadoAdapter
import com.example.parcialtp3.databinding.FragmentListadoBinding
import com.example.parcialtp3.entities.FoodPlace
import com.google.android.material.snackbar.Snackbar

class ListadoFragment : Fragment() {

    private lateinit var binding: FragmentListadoBinding
    private lateinit var recyclerListado : RecyclerView
    private lateinit var recyclerListadoAdapter: ListadoAdapter
    private var foodPlacesList = mutableListOf<FoodPlace>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListadoBinding.inflate(layoutInflater)

        recyclerListado = binding.recyclerListado

        return binding.root
    }

    override fun onStart() {
        super.onStart()

        loadList()

        recyclerListado.setHasFixedSize(true)
        recyclerListado.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerListadoAdapter = ListadoAdapter(foodPlacesList) { x ->
            onItemClick(x)
        }
        recyclerListado.adapter = recyclerListadoAdapter
    }

    private fun onItemClick (position : Int ) : Boolean{
        Snackbar.make(binding.root,position.toString(), Snackbar.LENGTH_SHORT).show()
        return true
    }

    private fun loadList() {
        foodPlacesList.add(FoodPlace(1,"asd","Pizza",2.5, ""))
        foodPlacesList.add(FoodPlace(2,"dsa","American food",3.1, ""))
        foodPlacesList.add(FoodPlace(6,"asbd","Pizza",5.4, ""))
        foodPlacesList.add(FoodPlace(2345,"hmdg","Japanese food",2.2, ""))
        foodPlacesList.add(FoodPlace(42,"gns","Pizza",4.5, ""))
    }
}