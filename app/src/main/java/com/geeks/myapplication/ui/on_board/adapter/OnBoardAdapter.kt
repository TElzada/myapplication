package com.geeks.myapplication.ui.on_board.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geeks.myapplication.data.models.OnBoardModel
import com.geeks.myapplication.databinding.ItemOnBoardBinding

class OnBoardAdapter(private val onBoardList:List<OnBoardModel>, val onStart:()->Unit,val onSkip:()-> Unit):
    RecyclerView.Adapter<OnBoardAdapter.OnBoardViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): OnBoardViewHolder {
        return OnBoardViewHolder(ItemOnBoardBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))
    }

    override fun onBindViewHolder(
        holder: OnBoardViewHolder,
        position: Int
    ) {
        holder.bind(onBoardList[position])
    }

    override fun getItemCount() = onBoardList.size


    inner class OnBoardViewHolder(private val binding: ItemOnBoardBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(onBoardModel: OnBoardModel){
            binding.lottieAnimation.setAnimation(onBoardModel.lottieRes)
            binding.lottieAnimation.playAnimation()
            binding.tvTitle.text = onBoardModel.title
            binding.tvDesc.text = onBoardModel.desc

            if ((adapterPosition) != onBoardList.size - 1) {
                binding.btnStart.visibility = View.GONE
                binding.tvSkip.setOnClickListener {
                    onSkip()
                }
            }else{
                binding.tvSkip.visibility = View.GONE
                binding.btnStart.setOnClickListener {
                    onStart()
                }
            }

        }
    }
}