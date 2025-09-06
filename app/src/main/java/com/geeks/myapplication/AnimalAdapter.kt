package com.geeks.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geeks.myapplication.databinding.ItemAnimalBinding

class AnimalAdapter(var animalList:List<AnimalModel > ): RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder >() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AnimalViewHolder {
        return AnimalViewHolder(ItemAnimalBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun onBindViewHolder(
        holder: AnimalViewHolder,
        position: Int
    ) {
        holder.onBind(animalList[position])
    }

    override fun getItemCount(): Int {
         return animalList.size
    }

    class AnimalViewHolder(private val binding: ItemAnimalBinding): RecyclerView.ViewHolder(binding.root)  {
        fun onBind(model: AnimalModel){
            binding.tvTitle.text=model.title
            binding.tvDesc.text=model.desc

            binding.imgAnimal.loadImg(model.img)
        }

    }
}