package com.example.orgs

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : Activity() {

        override fun onCreate(savedInstanceState: Bundle?){
            super.onCreate(savedInstanceState)
//            setContentView(R.layout.activity_main)
//            val textView2 = findViewById<TextView>(R.id.textView2)
//            textView2.text = "Cesta de Frutas."
//            val descricao = findViewById<TextView>(R.id.descricao)
//            descricao.text = "Laranja, Uva e Manga"
//            val preco = findViewById<TextView>(R.id.preco)
//            preco.text  = "19.99"

            val reclyerview = findViewById<RecyclerView>(R.id.reclyerview)

        }
}