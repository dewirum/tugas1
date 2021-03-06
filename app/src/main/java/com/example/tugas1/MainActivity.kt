package com.example.tugas1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.tugas1.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val putarButton: Button = findViewById(R.id.btn_putar)
//        val diceImage: ImageView = findViewById(R.id.dice_image)
        btn_putar.text = "jodoh"
        btn_putar.setOnClickListener {
            kocokDadu()
        }
    }

    private fun kocokDadu() {
        val randomcowok = Random().nextInt(6) + 1
        val randomcewek = Random().nextInt(6) + 1
        val drawableRecourcowok = when (randomcowok) {
            1 -> R.drawable.ab
            2 -> R.drawable.bc
            else -> R.drawable.edi
        }
        val drawableRecourcewek = when (randomcewek) {
            1 -> R.drawable.ayu
            2 -> R.drawable.rum
            else -> R.drawable.fuji
        }

        dice_image1.setImageResource(drawableRecourcowok)
        dice_image2.setImageResource(drawableRecourcewek)
    }
}
