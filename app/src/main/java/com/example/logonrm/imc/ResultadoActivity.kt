package com.example.logonrm.imc

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import com.example.logonrm.imc.extensions.format
import kotlinx.android.synthetic.main.activity_resultado.*
import kotlinx.android.synthetic.main.content_main.*

class ResultadoActivity : AppCompatActivity() {

    fun setaImagem(resourceID: Int){
        ivStatusIMC.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abaixo))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        if(intent.extras != null) {
            val peso = intent.getStringExtra("PESO").toDouble()
            val altura = intent.getStringExtra("ALTURA").toDouble()

            val imc = peso / (altura * altura)

            tvIMC.text = imc.format(1)

            if(imc<18.5) {
                tvStatusIMC.text = "Abaixo do Peso"
                setaImagem(R.drawable.magreza)

            }else if (imc<24.9) {
                tvStatusIMC.text = "Abaixo do Peso"
                setaImagem(R.drawable.abaixo)

            }else if  (imc<29.9) {
                tvStatusIMC.text = "Abaixo do Peso"
                setaImagem(R.drawable.ideal)

            }else if  (imc<24.9) {
                tvStatusIMC.text = "Abaixo do Peso"
                setaImagem(R.drawable.sobre)

            }else if  (imc<29.9) {
                tvStatusIMC.text = "Abaixo do Peso"
                setaImagem(R.drawable.obesidade)
            }
        }
        /*when (imc) {
               in 0..18 ->{
                   tvStatusIMC.text = "Abaiso do Peso"
                   ivStatusIMC.setImageDrawable(ContextCompat)
               }*/

    }
}
