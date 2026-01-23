package com.test.furnitureapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.test.furnitureapp.data.Product
import com.test.furnitureapp.databinding.ItemProductBinding

class ProductAdapter(private val onItemClicked: (Product) -> Unit) : ListAdapter<Product, ProductAdapter.ViewHolder>(ProductDiffCallback()) {

    class ViewHolder(val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentItem = getItem(position)

        holder.binding.productName.text = currentItem.name
        holder.binding.price.text = "$${currentItem.price}"

        Glide.with(holder.itemView.context)
            .load(currentItem.imageUrl)
            .into(holder.binding.productImage)

        holder.itemView.setOnClickListener {
            onItemClicked(currentItem)
        }
    }

}

class ProductDiffCallback : DiffUtil.ItemCallback<Product>(){

    override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem == newItem
    }

    override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
        return oldItem.id == newItem.id
    }
}