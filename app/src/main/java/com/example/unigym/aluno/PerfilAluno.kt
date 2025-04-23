package com.example.unigym.aluno

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.unigym.R

class PerfilAluno: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perfil_aluno)

        val botaoEditarDados = findViewById<Button>(R.id.btn_editar_dados)

        botaoEditarDados.setOnClickListener {
            val intent = Intent(this, PerfilAlunoEditar::class.java)
            startActivity(intent)
        }

    }


}