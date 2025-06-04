package com.example.unigym.aluno

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.unigym.R

class PerfilAlunoEditar : AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_aluno_editar)

        val btnConfirmarAlteracao = findViewById<Button>(R.id.btn_confirmar_alteracao_aluno)
        btnConfirmarAlteracao.setOnClickListener {
            val dialog = DialogEditarPerfilAluno()
            dialog.show(supportFragmentManager, "dialog_editar_perfil")

        }
    }
}