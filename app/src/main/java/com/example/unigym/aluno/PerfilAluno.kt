package com.example.unigym.aluno

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.unigym.DialogAlterarSenhaAluno
import com.example.unigym.R
import com.example.unigym.professor.DialogAlterarSenhaProfessor
import com.example.unigym.professor.DialogExcluirPerfilProfessor

class PerfilAluno: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perfil_aluno)

        val botaoEditarDados = findViewById<Button>(R.id.btn_editar_dados)

        botaoEditarDados.setOnClickListener {
            val intent = Intent(this, PerfilAlunoEditar::class.java)
            startActivity(intent)
        }
        val btnAlterarSenha = findViewById<Button>(R.id.btn_alterar_senha_aluno)
        btnAlterarSenha.setOnClickListener {
            val dialog = DialogAlterarSenhaAluno()
            dialog.show(supportFragmentManager, "dialog_alterar_senha")
    }
        val btnExcluirConta = findViewById<Button>(R.id.btn_excluir_conta)
        btnExcluirConta.setOnClickListener {
            val dialog = DialogExcluirPerfilProfessor()
            dialog.show(supportFragmentManager, "dialog_excluir_perfil")
        }
    }
}


