package com.abdullah.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.abdullah.myapplication.person.Person
import kotlinx.android.synthetic.main.fragment_anasayfa.view.*


class AnasayfaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_anasayfa, container, false)

        tasarim.baslaButonu.setOnClickListener {

            val person:Person = Person("Abdullah",26,false)
            val gecis =
                AnasayfaFragmentDirections.oyunEkraninaGecis(person).setIsim("Abdullah").setYas(26)

            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim
    }

}