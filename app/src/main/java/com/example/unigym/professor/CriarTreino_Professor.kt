package com.example.unigym.professor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.unigym.R

class CriarTreino_Professor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_criar_treino_professor)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnConfirmarFicha = findViewById<Button>(R.id.ConfirmarFichabtn)
        btnConfirmarFicha.setOnClickListener {
            val dialog = DialogMarcarAula_Professor()
            dialog.show(supportFragmentManager, "DialogMarcarAula_Professor")
        }
        val btnAdicionarExercicio = findViewById<ImageButton>(R.id.btnAdicionarExercicio)
        btnAdicionarExercicio.setOnClickListener {
            val intent = Intent(this, CriarTreino_Professor::class.java)
            startActivity(intent)
        }
    }
}