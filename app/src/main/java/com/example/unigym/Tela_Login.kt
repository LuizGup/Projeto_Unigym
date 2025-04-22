package com.example.unigym

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.unigym.professor.Homepage_Professor

class Tela_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)

        //Botoes de referencia
        val esquecersenha= findViewById<Button>(R.id.esqueceusenha)
        val entrar = findViewById<Button>(R.id.Entrar)
        val ntemcadasttro = findViewById<Button>(R.id.Ntemcadastro)

        entrar.setOnClickListener{
            startActivity(Intent(this, Homepage_Professor::class.java))
        }

        esquecersenha.setOnClickListener{
            startActivity(Intent(this,Tela_EsquecerSenha::class.java))
        }
        ntemcadasttro.setOnClickListener{
            startActivity(Intent(this,TelaInicial::class.java))
        }
    }
}