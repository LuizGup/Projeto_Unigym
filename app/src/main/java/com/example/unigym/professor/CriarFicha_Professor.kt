package com.example.unigym.professor

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.unigym.R

class CriarFicha_Professor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criar_ficha_professor)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//
//        val btnAdicionarExercicio = findViewById<ImageButton>(R.id.btnAdicionarExercicio)
//        btnAdicionarExercicio.setOnClickListener {
//            val intent = Intent(this, ExerciciosCriadosAdicionar::class.java)
//            startActivity(intent)
//        }
    }
}