package com.geeks.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geeks.myapplication.databinding.ItemCarBinding

class CarAdapter(var carList: List<CarModel>) :
    RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(
            ItemCarBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.onBind(carList[position])
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    class CarViewHolder(private val binding: ItemCarBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: CarModel) {
            binding.tvTitle.text = model.title
            binding.tvPrice.text = model.price
            binding.tvType.text = model.type
            binding.tvTransmission.text = model.transmission
            binding.tvAC.text = model.ac

            Glide.with(binding.ivCar.context)
                .load(model.img)
                .into(binding.ivCar)
        }
    }
}
