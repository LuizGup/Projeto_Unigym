package com.example.unigym

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
//
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tela_EsquecerSenha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        
        setContentView(R.layout.activity_tela_esquecer_senha)

        val btntrocasenha = findViewById<Button>(R.id.enviodesenha)

        btntrocasenha.setOnClickListener {
            val toast = Toast.makeText(this, "Email de alteração de senha enviado", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP, 0, 400)
            toast.show()
        }
    }
}