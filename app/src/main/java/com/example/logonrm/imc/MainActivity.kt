package com.example.logonrm.imc

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btCalcular.setOnClickListener {
            val telaResultado = Intent(this, ResultadoActivity::class.java)

            telaResultado.putExtra( "PESO",
            inputPeso.editText?.text.toString())

            telaResultado.putExtra( "ALTURA",
                    inputAltura.editText?.text.toString())

            startActivity(telaResultado)

        }
        btLimpar.setOnClickListener {
            inputAltura.editText?.setText("")
            inputPeso.editText?.setText("")
            inputPeso.requestFocus()

        }

    }

}