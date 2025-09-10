package com.geeks.myapplication.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.geeks.myapplication.data.models.CarModel
import com.geeks.myapplication.databinding.FragmentDetailCarBinding
import com.geeks.myapplication.utils.AppKey

class DetailCarFragment : Fragment() {
    private lateinit var binding: FragmentDetailCarBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailCarBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = DetailCarFragmentArgs.fromBundle(requireArguments())
        val carModel = args.carModel

        binding.tvCar.text = carModel.title
        binding.tvShape.text = carModel.price
        Glide.with(requireContext())
            .load(carModel.img)
            .into(binding.ivCar)
    }

}