package com.example.myapp.ui.animes.select.seasons


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapp.databinding.FragmentSeasonsBinding


class SeasonFragment: Fragment() {
    private var binding: FragmentSeasonsBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSeasonsBinding.inflate(LayoutInflater.from(context), container,false )
        return binding!!.root
    }
}