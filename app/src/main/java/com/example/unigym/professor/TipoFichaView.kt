package com.example.unigym.professor

import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.fragment.app.FragmentActivity
import com.example.unigym.R

class TipoFichaView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.activity_tipo_ficha_view, this, true)

        val btnCriarFicha = findViewById<ImageButton>(R.id.btnCriarFicha)
        btnCriarFicha.setOnClickListener {
            val intent = Intent(context, CriarTreino_Professor::class.java)
            context.startActivity(intent)
        }

        // Você pode adicionar mais lógicas aqui, como setar dados no layout
    }
}
