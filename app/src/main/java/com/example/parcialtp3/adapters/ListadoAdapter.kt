package com.example.parcialtp3.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialtp3.R
import com.example.parcialtp3.databinding.ItemFoodplaceBinding
import com.example.parcialtp3.entities.FoodPlace
import com.squareup.picasso.Picasso

class ListadoAdapter (
    private var foodPlacesList: List<FoodPlace>?,
    val onItemClick: (Int) -> Boolean
) : RecyclerView.Adapter<ListadoAdapter.FoodPlaceHolder>() {

    override fun getItemCount(): Int {
        return foodPlacesList!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodPlaceHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_foodplace,parent,false)
        return (FoodPlaceHolder(view))
    }

    override fun onBindViewHolder(holder: FoodPlaceHolder, position: Int) {

        holder.setTitle(foodPlacesList!![position].name)
        holder.setType(foodPlacesList!![position].type)
        holder.setPunctuation(foodPlacesList!![position].punctuation)

        holder.getCardLayout().setOnClickListener{
            onItemClick(position)
        }
    }

    class FoodPlaceHolder (v: View) : RecyclerView.ViewHolder(v) {

        private val binding = ItemFoodplaceBinding.bind(v)

        fun setTitle(title: String) {
            binding.txtTitleFoodItem.text = title
        }

        fun setType(type: String) {
            binding.txtTypeFoodplace.text = type
        }

        fun setPunctuation(points: Double) {
            binding.txtPunctuationFoodplace.text = points.toString()
        }

        fun setImage(path: String) {
            Picasso.get().load(path).into(binding.imgItemFoodplace)
        }

        fun getCardLayout (): CardView {
            return binding.cardItemListado
        }

    }
}