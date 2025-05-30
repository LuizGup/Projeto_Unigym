package com.example.unigym.professor

import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.fragment.app.FragmentActivity
import com.example.unigym.R

class ExercicioProfessorView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.activity_exercicio_professor_view, this, true)

        val btnExercicioProfessor = findViewById<ImageButton>(R.id.btnExercicioProfessor)
        btnExercicioProfessor.setOnClickListener {
            val intent = Intent(context, ExerciciosCriadosAdicionar::class.java)
            context.startActivity(intent)
        }

        // Você pode adicionar mais lógicas aqui, como setar dados no layout
    }
}
