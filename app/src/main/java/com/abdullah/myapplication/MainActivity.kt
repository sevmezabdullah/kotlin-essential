package com.abdullah.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {


    override fun onStart() {
        super.onStart()
        Log.e("onStart", "Çalıştı")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop", "Çalıştı")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume", "Çalıştı")


    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause", "Çalıştı")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", "Çalıştı")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}