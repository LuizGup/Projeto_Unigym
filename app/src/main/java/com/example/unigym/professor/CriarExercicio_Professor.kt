package com.example.unigym.professor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.unigym.R

class CriarExercicio_Professor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criar_exercicio_professor)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val Confirmarbtn = findViewById<Button>(R.id.Confirmarbtn)

        // Ação: Criar ficha ou exercício
        Confirmarbtn.setOnClickListener {
            val intent = Intent(this, ExerciciosCriados::class.java)
            startActivity(intent)
        }
    }
}