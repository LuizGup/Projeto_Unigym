package com.example.unigym.professor

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageButton
import com.example.unigym.R

class TreinosCriados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_treinos_criados)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnApagarTreino = findViewById<ImageButton>(R.id.btnApagarTreino)
        btnApagarTreino.setOnClickListener {
            val dialog = ApagarTreinoDialog()
            dialog.show(supportFragmentManager, "ApagarTreinoDialog")
        }
    }
}