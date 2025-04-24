package com.example.unigym.professor

import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.fragment.app.FragmentActivity
import com.example.unigym.R

class TreinoView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.view_treino, this, true)

        val btnApagar = findViewById<ImageButton>(R.id.btnApagarTreino)
        btnApagar.setOnClickListener {
            if (context is FragmentActivity) {
                val dialog = ApagarTreinoDialog()
                dialog.show((context as FragmentActivity).supportFragmentManager, "ApagarTreinoDialog")
            }
        }
        val btnEditar = findViewById<ImageButton>(R.id.btnEditar)
        btnEditar.setOnClickListener {
            val intent = Intent(context, CriarTreino_Professor::class.java)
            context.startActivity(intent)
        }


    }
}
