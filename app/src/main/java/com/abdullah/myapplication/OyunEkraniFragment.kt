package com.abdullah.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.abdullah.myapplication.person.Person
import kotlinx.android.synthetic.main.fragment_oyun_ekrani.view.*

class OyunEkraniFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_oyun_ekrani, container, false)

        val bundle: OyunEkraniFragmentArgs by navArgs()


        Log.e("Gelen Ad", bundle.isim)
        Log.e("Gelen Ad", bundle.yas.toString())
        val personFromFragment: Person = bundle.person


        Log.e("Gelen Person : ", personFromFragment.name)
        tasarim.bitirButonu.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bitis_ekranina_gecis)
        }
        tasarim.ad.text = bundle.isim
        tasarim.yas.text = bundle.yas.toString()
        return tasarim
    }


}