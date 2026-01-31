package com.test.furnitureapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.test.furnitureapp.R
import com.test.furnitureapp.databinding.ItemBannerBinding

data class BannerItem(val title: String, val description: String) {

    class BannerAdapter(private val items: List<BannerItem>) : RecyclerView.Adapter<BannerAdapter.BannerViewHolder>(){

        inner class BannerViewHolder(view: View) : RecyclerView.ViewHolder(view){
            val title: TextView = view.findViewById(R.id.banner_title)
            val description: TextView = view.findViewById(R.id.banner_desc)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_banner, parent, false)
            return BannerViewHolder(view)
        }

        override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
            val item = items[position]

            holder.title.text = item.title
            holder.description.text = item.description
        }

        override fun getItemCount(): Int = items.size

    }
}