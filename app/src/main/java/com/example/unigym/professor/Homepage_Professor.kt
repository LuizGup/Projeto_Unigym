package com.example.unigym.professor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.unigym.R

class    Homepage_Professor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage_professor)

        // Ajuste de padding para barras do sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Referência aos botões
        val btnCriarFicha = findViewById<Button>(R.id.CriarFicha_btn)
        val btnAulasAgendadas = findViewById<Button>(R.id.AulasAgendadasbtn)
        val btnVisualizarTreino = findViewById<Button>(R.id.VizualizarTreinobtn)

        // Ação: Criar ficha ou exercício
        btnCriarFicha.setOnClickListener {
            val dialog = CriarOpcaoDialog()
            dialog.show(supportFragmentManager, "CriarOpcaoDialog")
        }

        // Ação: Ir para aulas agendadas
        btnAulasAgendadas.setOnClickListener {
            startActivity(Intent(this, Calendario_Aulas_Professor::class.java))
        }

        // Ação: Ir para visualizar treinos
        btnVisualizarTreino.setOnClickListener {
            startActivity(Intent(this, VisualizarTreinos_Professor::class.java))
        }
    }
}
