package com.example.homework6.ui.fragment

import android.icu.lang.UCharacter.VerticalOrientation
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.homework6.R
import com.example.homework6.data.entity.Filmler
import com.example.homework6.databinding.FragmentAnasayfaBinding
import com.example.homework6.ui.adapter.FilmlerAdapter


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        val filmlerListesi = ArrayList<Filmler>()
        val f1 = Filmler(1,"Dune","dune","Ailesini yok eden komploculara karşı başlattığı intikam savaşında Chani ve Fremen'lerle birleşen Paul Atreides'in yolculuğu anlatan Dune: Part Two'da, Paul hayatının aşkıyla, bilinen evrenin kaderi arasında bir seçim yapma durumunda kalırken, yalnızca kendisinin öngörebileceği korkunç bir geleceği engellemeye çalışır. ")
        val f2 = Filmler(2,"Kral Şakir: Devler Uyandı","kralsakir","Şirket’in sahibi Harun adındaki yatırımcı, geçmişte Şakir’in babaannesi olan arkeolog Seniha'nın önderliğinde keşif gezileri düzenlemiş ve tarihler öncesine ait bir taşı ortaya çıkarmıştır. Bu taşın içine hapsolmuş, kötü savaşçı ise, yüzyıllardır kilitli kaldığı bu taştan dışarı çıkar ve Harun’un içine girer. Harun, yarattığı teknolojik orduyu dünyayı ele geçirmek üzere harekete geçirir. Şakir ve ailesi ise, hem kayıp olan babaanne Seniha'yı bulmaya çalışacak, hem de dünyayı kötü niyetli savaşçıdan korumaya çalışacaklardır.")
        val f3 = Filmler(3,"Lohusa","lohusa","Lohusa, bir anne ve babanın, doğumdan sonra yaşadıkları ilk 40 gün ve bu süre içinde başlarına gelen komik olayları anlatıyor. ")
        val f4 = Filmler(4,"Erdal ile Ece","erdalileece","Oto saniyede kuzeni Oğuz ile birlikte araç kaplama ve modifiye işleriyle uğraşan Erdal ile kurumsal bir şirkette yönetici olarak çalışan Ece uzun yıllardır birlikte olan evli bir çifttir. Film, günümüz evlilik ilişkilerinde sıkça karşılaşılan acı tatlı çatışmaları ve bu sırada ortaya çıkan birbirinden komik ve eğlenceli olayları birbirini seven bu ikilinin gözünden ayrı ayrı anlatıyor. ")
        val f5 = Filmler(5,"Zaferin Rengi","zaferinrengi","Film, Milli Mücadele'nin zaferle sonuçlanmasının arifesinde, hâlâ işgal altında olan İstanbul'da Harington Kupası kapsamında karşı karşıya geldiği Birleşik Krallık işgal kuvvetleri karma futbol takımına karşı zafer elde eden Fenerbahçe'nin bu galibiyetini, istiklâl mücadelesinde yer alan dönemin önemli isimleri eşliğinde anlatıyor. ")
        val f6 = Filmler(6,"Rafadan Tayfa 4: Hayrimatör","rafadantayfa4","Uzaya çıkan en genç insan olan Hayri, oldukça meşhur olmuş; üstün zekâlı öğrencilerin alındığı bir bilim teknik okuluna kabul edilmiştir. Artık mahallede çok az vakit geçiriyor, vaktinin çoğunu kendi tabiri ile “Yüz Yılın İcadı” olan dev robot Hayrimatör’e harcıyordur. Hayri, bir mühendislik harikası olarak tasarladığı halde Hayrimatör’ü çalıştıracak güç kaynağını bir türlü elde edememiştir. Hayri, uzaylı kahramanımız Zobi’nin desteğiyle Hayrimatör'ü çalıştırmayı başarır; ancak kötüler icadın peşine düşer. ")

        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)
        filmlerListesi.add(f6)


        val filmlerAdapter = FilmlerAdapter(requireContext(),filmlerListesi)
        binding.filmlerRv.adapter = filmlerAdapter

        binding.filmlerRv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)


        return binding.root
    }


}