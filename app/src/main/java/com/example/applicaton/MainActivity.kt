package com.example.applicaton

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.applicaton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var mes: Int

        binding.Button.setOnClickListener {
            val mes = binding.Numeral.text.toString().toInt()
            binding.Numeral.setText("")
            binding.Resultado.text = when (mes) {
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

                else -> "Não existe esse número"
            }


        }


    }
}








