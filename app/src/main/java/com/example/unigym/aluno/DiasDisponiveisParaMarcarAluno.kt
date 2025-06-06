package com.example.unigym.aluno

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.unigym.R

class DiasDisponiveisParaMarcarAluno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContentView(R.layout.activity_dias_disponiveis_para_marcar_aluno)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val ConfirmarDiabtn = findViewById<Button>(R.id.ConfirmarDiabtn)
        ConfirmarDiabtn.setOnClickListener {
            startActivity(Intent(this, ConfirmarDataAluno::class.java))
        }
    }
}