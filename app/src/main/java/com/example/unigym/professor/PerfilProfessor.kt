package com.example.unigym.professor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.unigym.R

class PerfilProfessor : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perfil_professor)

        val editarDadosAluno = findViewById<Button>(R.id.btn_editar_dados_professor)
        editarDadosAluno.setOnClickListener {

            val intent = Intent(this, PerfilProfessorEditar::class.java)
            startActivity(intent)

            val btnAlterarSenha = findViewById<Button>(R.id.btn_alterar_senha_professor)
            btnAlterarSenha.setOnClickListener {
                val dialog = DialogAlterarSenhaProfessor()
                dialog.show(supportFragmentManager, "dialog_alterar_senha")
            }
     }
    }
}