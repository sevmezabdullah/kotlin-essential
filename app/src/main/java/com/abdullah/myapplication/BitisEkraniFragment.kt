package com.abdullah.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class BitisEkraniFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_bitis_ekrani, container, false)
        return tasarim
    }


}