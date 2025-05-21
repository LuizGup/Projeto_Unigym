package com.example.unigym

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.unigym.professor.CriarOpcaoDialog
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class TelaInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)
        //Botoes Referencia
        val criarconta = findViewById<Button>(R.id.CriarConta)
        val jatemcadastro = findViewById<Button>(R.id.Já_tem_cadastro)

        //POP UP
        criarconta.setOnClickListener{
            val dialog = Dialog_Cadastro_ProfouAluno()
            dialog.show(supportFragmentManager, "Dialog_Cadastro_ProfouAluno")
        }
        //troca de tela JA TEM CADASTRO
        jatemcadastro.setOnClickListener{
            startActivity(Intent(this, Tela_Login::class.java))
        }

    }
}