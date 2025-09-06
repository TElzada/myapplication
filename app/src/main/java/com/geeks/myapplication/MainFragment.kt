package com.geeks.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geeks.myapplication.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private var list = arrayListOf<AnimalModel>()
    private lateinit var animalAdapter: AnimalAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        initView()
    }

    private fun initView() {
        animalAdapter = AnimalAdapter(list)
        binding.rvAnimal.adapter = animalAdapter
    }

    private fun loadData() {
        list = arrayListOf<AnimalModel>(AnimalModel(
            img="https://bigcatswildcats.com/wp-content/uploads/2024/06/bengal-tiger-from-Asia.jpg",
            title="Tiger",
            desc = "cat"), AnimalModel(
            img="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTdyV4X8GurMxk4adsfDZ5fM9f7Ak4euSQiA&s",
            title="Shark",
            desc = "fish"), AnimalModel(
            img="https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Labrador_Retriever_portrait.jpg/960px-Labrador_Retriever_portrait.jpg",
            title="Dog",
            desc = "pet"), AnimalModel(
            img="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-39162XZhBu74oHR5bG6QgqJ_muTezRH44A&s",
            title="Chicken",
            desc = "cook"),AnimalModel(
            img="https://bigcatswildcats.com/wp-content/uploads/2024/06/bengal-tiger-from-Asia.jpg",
            title="Tiger",
            desc = "cat"), AnimalModel(
            img="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTdyV4X8GurMxk4adsfDZ5fM9f7Ak4euSQiA&s",
            title="Shark",
            desc = "fish"), AnimalModel(
            img="https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Labrador_Retriever_portrait.jpg/960px-Labrador_Retriever_portrait.jpg",
            title="Dog",
            desc = "pet"), AnimalModel(
            img="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-39162XZhBu74oHR5bG6QgqJ_muTezRH44A&s",
            title="Chicken",
            desc = "cook"),AnimalModel(
            img="https://bigcatswildcats.com/wp-content/uploads/2024/06/bengal-tiger-from-Asia.jpg",
            title="Tiger",
            desc = "cat"), AnimalModel(
            img="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTdyV4X8GurMxk4adsfDZ5fM9f7Ak4euSQiA&s",
            title="Shark",
            desc = "fish"), AnimalModel(
            img="https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Labrador_Retriever_portrait.jpg/960px-Labrador_Retriever_portrait.jpg",
            title="Dog",
            desc = "pet"), AnimalModel(
            img="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-39162XZhBu74oHR5bG6QgqJ_muTezRH44A&s",
            title="Chicken",
            desc = "cook"),AnimalModel(
            img="https://bigcatswildcats.com/wp-content/uploads/2024/06/bengal-tiger-from-Asia.jpg",
            title="Tiger",
            desc = "cat"), AnimalModel(
            img="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTdyV4X8GurMxk4adsfDZ5fM9f7Ak4euSQiA&s",
            title="Shark",
            desc = "fish"), AnimalModel(
            img="https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Labrador_Retriever_portrait.jpg/960px-Labrador_Retriever_portrait.jpg",
            title="Dog",
            desc = "pet"), AnimalModel(
            img="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-39162XZhBu74oHR5bG6QgqJ_muTezRH44A&s",
            title="Chicken",
            desc = "cook"))
    }
}