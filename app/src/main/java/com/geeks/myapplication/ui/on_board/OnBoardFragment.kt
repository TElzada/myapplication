package com.geeks.myapplication.ui.on_board

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geeks.myapplication.R
import com.geeks.myapplication.data.models.OnBoardModel
import com.geeks.myapplication.databinding.FragmentMainBinding
import com.geeks.myapplication.databinding.FragmentOnBoardBinding
import com.geeks.myapplication.ui.on_board.adapter.OnBoardAdapter

class OnBoardFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardBinding
    private lateinit var adapter: OnBoardAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = OnBoardAdapter(loadOnBoardData(),::onStartBoard, ::onSkipBoard)
        binding.vpOnBoard.adapter= adapter
    }
    private fun onSkipBoard(){
        binding.vpOnBoard.currentItem = loadOnBoardData().size
    }
    private fun onStartBoard(){
        findNavController().navigate(R.id.mainFragment)
    }
    private fun loadOnBoardData():List<OnBoardModel>{
        return listOf(OnBoardModel(
            title = "Удобство",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRbWcauyDceOdMIIEY0iycR2j5EiVoIhDhq1A&s",
            desc = "Создавайте заметки в два клика! Записывайте мысли, идеи и важные задачи мгновенно."),
            OnBoardModel(
            title = "Организация",
            img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRbWcauyDceOdMIIEY0iycR2j5EiVoIhDhq1A&s",
            desc = "Организуйте заметки по папкам и тегам. Легко находите нужную информацию в любое время."),
            OnBoardModel(
                title = "Синхронизация",
                img = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRbWcauyDceOdMIIEY0iycR2j5EiVoIhDhq1A&s",
                desc = "Синхронизация на всех устройствах. Доступ к записям в любое время и в любом месте."))
    }
}