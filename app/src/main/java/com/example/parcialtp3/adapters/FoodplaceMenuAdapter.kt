package com.example.parcialtp3.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialtp3.R
import com.example.parcialtp3.databinding.ItemFooditemBinding
import com.example.parcialtp3.databinding.ItemFoodplaceBinding
import com.example.parcialtp3.entities.FoodItem

class FoodplaceMenuAdapter (
    private var foodItemsList: List<FoodItem>?,
    val onItemClick: (Int) -> Boolean
) : RecyclerView.Adapter<FoodplaceMenuAdapter.FoodItemHolder>() {

    override fun getItemCount(): Int {
        return foodItemsList!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodItemHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_fooditem,parent,false)
        return (FoodItemHolder(view))
    }

    override fun onBindViewHolder(holder: FoodItemHolder, position: Int) {

        holder.setTitle(foodItemsList!![position].name)
        holder.setPrice(foodItemsList!![position].price)

        holder.getCardLayout().setOnClickListener{
            onItemClick(position)
        }
    }

    class FoodItemHolder (v: View) : RecyclerView.ViewHolder(v) {

        private val binding = ItemFooditemBinding.bind(v)

        fun setTitle(title: String) {
            binding.txtTitleFoodItem.text = title
        }
        fun setPrice(price: Double) {
            binding.txtPriceFoodItem.text = "$${price}"
        }
        fun getCardLayout (): CardView {
            return binding.cardItemListado
        }

    }
}