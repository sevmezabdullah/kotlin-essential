package com.abdullah.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragmentbirinci.view.*

class FragmentFirst() : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragmentbirinci, container, false)

        rootView.button.setOnClickListener {
            rootView.textView.text="Merhaba"
        }
        return rootView
    }
}