package com.example.parcialtp3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialtp3.R
import com.example.parcialtp3.adapters.FoodplaceMenuAdapter
import com.example.parcialtp3.adapters.ListadoAdapter
import com.example.parcialtp3.databinding.FragmentHistoricoBinding
import com.example.parcialtp3.databinding.FragmentListadoBinding
import com.example.parcialtp3.entities.FoodItem
import com.example.parcialtp3.entities.FoodPlace
import com.google.android.material.snackbar.Snackbar

class HistoricoFragment : Fragment() {

    private lateinit var binding: FragmentHistoricoBinding
    private lateinit var recyclerListado : RecyclerView
    private lateinit var recyclerListadoAdapter: FoodplaceMenuAdapter
    private var foodItemsList = mutableListOf<FoodItem>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHistoricoBinding.inflate(layoutInflater)

        recyclerListado = binding.recyclerMenu

        return binding.root
    }

    override fun onStart() {
        super.onStart()

        loadList()

        recyclerListado.setHasFixedSize(true)
        recyclerListado.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerListadoAdapter = FoodplaceMenuAdapter(foodItemsList) { x ->
            onItemClick(x)
        }
        recyclerListado.adapter = recyclerListadoAdapter
    }

    private fun onItemClick (position : Int ) : Boolean{
        Snackbar.make(binding.root,position.toString(), Snackbar.LENGTH_SHORT).show()
        return true
    }

    private fun loadList() {
        foodItemsList.add(FoodItem(1,"asd",2.5))
        foodItemsList.add(FoodItem(2,"dsa",3.1))
        foodItemsList.add(FoodItem(6,"asbd",5.4))
        foodItemsList.add(FoodItem(2345,"hmdg",2.2))
        foodItemsList.add(FoodItem(42,"gns",4.5))
    }
}