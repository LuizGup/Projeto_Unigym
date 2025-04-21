package com.example.unigym

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.fragment.app.FragmentActivity

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

        // Você pode adicionar mais lógicas aqui, como setar dados no layout
    }
}
