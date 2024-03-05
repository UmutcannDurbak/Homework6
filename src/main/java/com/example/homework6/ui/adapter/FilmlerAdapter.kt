package com.example.homework6.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.homework6.data.entity.Filmler
import com.example.homework6.databinding.CardTasarimBinding
import com.example.homework6.ui.fragment.AnasayfaFragmentDirections


class FilmlerAdapter(var mContext: Context, var filmlerListesi: List<Filmler>)
    : RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu (var tasarim: CardTasarimBinding): RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu (binding)
    }


    override fun onBindViewHolder (holder: CardTasarimTutucu, position: Int) {//0,1,2
        val film =  filmlerListesi.get(position)
        val t = holder.tasarim

        t.imageViewFilm.setImageResource(mContext.resources.getIdentifier(film.resim,"drawable", mContext.packageName))

        t.textViewAd.text = film.ad

        t.buttonDetay.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.detayGecis(film = film)
            Navigation.findNavController(it).navigate(gecis)
        }

        t.cardViewFilm.setOnClickListener{
            val gecis = AnasayfaFragmentDirections.detayGecis(film = film)
            Navigation.findNavController(it).navigate(gecis)
        }

    }

    override fun getItemCount(): Int {
        return filmlerListesi.size
    }
}
