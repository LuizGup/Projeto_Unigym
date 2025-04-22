package com.example.unigym

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        //Botoes Referencia
        val criarconta = findViewById<Button>(R.id.CriarConta)
        val jatemcadastro = findViewById<Button>(R.id.Já_tem_cadastro)


        //troca de tela JA TEM CADASTRO
        jatemcadastro.setOnClickListener{
            startActivity(Intent(this, Tela_Login::class.java))
        }

    }
}