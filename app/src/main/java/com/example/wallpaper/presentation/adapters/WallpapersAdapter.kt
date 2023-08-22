package com.example.wallpaper.presentation.adapters

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wallpaper.R
import com.example.wallpaper.domain.model.Wallpaper

class WallpapersAdapter(private val wallpaper: List<Wallpaper>):
    RecyclerView.Adapter<WallpapersAdapter.ViewHolder>() {
   inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
       private val imageView:ImageView = itemView.findViewById(R.id.image_view)
       private val titleTextView:TextView = itemView.findViewById(R.id.title_text_view)
       fun bind(wallpaper: Wallpaper){
           titleTextView.text = wallpaper.title
           Picasso.get()
       }

    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WallpapersAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: WallpapersAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}