package com.example.applicaton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()



        Button.setOnClickListener {
            val mes = Numeral.text.toString().toInt()
            Numeral.setText("")
            Resultado.text = when (mes) {
                1 ->
                    "Janeiro"

                2 ->
                    "Fevereiro"

                3 ->
                    "Março"

                4 ->
                    "Abril"

                5 ->
                    "Maio"

                6 ->
                    "Junho"

                7 ->
                    "Julho"

                8 ->
                    "Agosto"

                9 ->
                    "Setembro"

                10 ->
                    "Outubro"

                11 ->
                    "Novembro"

                12 ->
                    "Dezembro"

                else ->
                    "Esse mês não existe"

            }


        }

    }


}


