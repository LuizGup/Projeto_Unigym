package com.example.unigym.aluno

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.unigym.R
import com.example.unigym.professor.Homepage_Professor

class TelaCadastro_Aluno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_cadastro_aluno)

        val entrar = findViewById<Button>(R.id.Criar_conta)

        entrar.setOnClickListener{
            startActivity(Intent(this, Homepage_Professor::class.java))
        }
    }
}