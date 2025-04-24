package com.example.unigym.aluno

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.unigym.R

class HomePageAluno : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page_aluno)

        // Ajuste de padding para barras do sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Referência aos botões
        val DiasTreinadosbtn = findViewById<Button>(R.id.DiasTreinadosbtn)
        val MarcarAulabtn = findViewById<Button>(R.id.VizualizarTreinobtn)
        val FichaDoDiabtn = findViewById<Button>(R.id.FichaDoDiabtn)

        // Ação: Criar ficha ou exercício
        DiasTreinadosbtn.setOnClickListener {
            startActivity(Intent(this, DiasTreinadosAluno::class.java))
        }

        // Ação: Ir para aulas agendadas
        MarcarAulabtn.setOnClickListener {
            startActivity(Intent(this, MarcarAulaAluno::class.java))
        }

        // Ação: Ir para visualizar treinos
        FichaDoDiabtn.setOnClickListener {
            startActivity(Intent(this,FichaDoDia::class.java))
        }
    }
}
