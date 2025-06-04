package com.example.unigym.aluno

import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.example.unigym.R
import com.example.unigym.professor.ApagarTreinoDialog

class ConfirmarDataAlunoView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.activity_confirmar_data_aluno_view, this, true)

        val btnEditar = findViewById<ImageButton>(R.id.btnConfirmarAula)

        btnEditar.setOnClickListener {
            if (context is FragmentActivity) {
                val dialog = DialogDeConfirmacaoDeMarcarAula()
                dialog.show((context as FragmentActivity).supportFragmentManager, "DialogDeConfirmacaoDeMarcarAula")
            }
        }
    }
}
