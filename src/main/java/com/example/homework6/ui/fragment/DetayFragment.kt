package com.example.homework6.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.homework6.R
import com.example.homework6.databinding.FragmentAnasayfaBinding
import com.example.homework6.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)


        val bundle:DetayFragmentArgs by navArgs()
        val film = bundle.film

        binding.toolbarDetay.title = film.ad

        binding.ivFilm.setImageResource(resources.getIdentifier(film.resim,"drawable", requireContext().packageName))

        binding.tvDetay.text = film.detay

        return binding.root
    }


}