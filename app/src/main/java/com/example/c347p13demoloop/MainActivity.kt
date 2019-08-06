package com.example.c347p13demoloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCount.setOnClickListener {
            for (i in 1..5){
                Log.d("MainActivity", "$i")
            }
        }

        btnLetter.setOnClickListener {
            val word = editText.text.toString()
            for (letter in word){
                Log.d("MainActivity", "$letter")
            }
        }
    }
}
