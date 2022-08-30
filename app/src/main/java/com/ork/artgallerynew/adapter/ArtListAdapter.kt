package com.ork.artgallerynew.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.ork.artgallerynew.R
import com.ork.artgallerynew.databinding.ItemRowBinding
import com.ork.artgallerynew.model.Art
import com.ork.artgallerynew.view.ArtListDirections

class ArtListAdapter(private val artList : List<Art>) : RecyclerView.Adapter<ArtListAdapter.ArtHolder>() {

    class ArtHolder(val binding : ItemRowBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtHolder {
        val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ArtHolder(binding)
    }

    override fun getItemCount(): Int {
        return artList.size
    }

    override fun onBindViewHolder(holder: ArtHolder, position: Int) {

        holder.binding.artNameText.text = artList[position].artName
        holder.itemView.setOnClickListener {

            val action = ArtListDirections.actionArtListToDetailFragment("old", artList[position].id)
            Navigation.findNavController(it).navigate(action)




        }
    }
}


