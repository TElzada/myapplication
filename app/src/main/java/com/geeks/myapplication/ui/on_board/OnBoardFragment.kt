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
import com.geeks.myapplication.utils.Prefs

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
        binding.wormDotsIndicator.setViewPager2(binding.vpOnBoard)
    }
    private fun onSkipBoard(){
        binding.vpOnBoard.currentItem = loadOnBoardData().size-1
    }
    private fun onStartBoard() {
        Prefs.setOnBoardShown(requireContext(), true)
        val action = OnBoardFragmentDirections.actionOnBoardFragmentToNotesFragment()
        findNavController().navigate(action)
    }

    private fun loadOnBoardData():List<OnBoardModel>{
        return listOf(OnBoardModel(
            title = "Удобство",
            lottieRes = R.raw.first_animation,
            desc = "Создавайте заметки в два клика! Записывайте мысли, идеи и важные задачи мгновенно."),
            OnBoardModel(
            title = "Организация",
            lottieRes = R.raw.second_animation,
            desc = "Организуйте заметки по папкам и тегам. Легко находите нужную информацию в любое время."),
            OnBoardModel(
                title = "Синхронизация",
                lottieRes = R.raw.third_animation,
                desc = "Синхронизация на всех устройствах. Доступ к записям в любое время и в любом месте."))
    }


}