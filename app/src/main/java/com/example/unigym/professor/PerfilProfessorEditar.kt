package com.example.unigym.professor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.unigym.DialogAlterarSenhaAluno
import com.example.unigym.R
import com.example.unigym.aluno.DialogEditarPerfilAluno

class PerfilProfessorEditar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_professor_editar)

        val btnConfirmarAlteracao = findViewById<Button>(R.id.btn_confirmar_alteracao_professor)
        btnConfirmarAlteracao.setOnClickListener {
            val dialog = DialogEditarPerfilAluno()
            dialog.show(supportFragmentManager, "dialog_editar_perfil")
        }
    }
}
