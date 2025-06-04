package com.example.unigym.aluno

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.core.content.ContextCompat.startActivity
import com.example.unigym.R
import com.example.unigym.professor.Homepage_Professor


@SuppressLint("CustomViewStyleable")
class ToolBarAlunoView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.activity_tool_bar_aluno_view, this, true)

        // Lê o atributo personalizado
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.ToolBarView)
        val currentScreenName = typedArray.getString(R.styleable.ToolBarView_currentScreen)
        typedArray.recycle()

        val btnHome = findViewById<ImageButton>(R.id.btnHome)
        val btnGym = findViewById<ImageButton>(R.id.btnGym)
        val btnProfile = findViewById<ImageButton>(R.id.btnProfile)

        btnHome.setOnClickListener {
            if (currentScreenName != "HomePageAluno") {
                val intent = Intent(context, HomePageAluno::class.java)
                context.startActivity(intent)
            }
        }


        btnGym.setOnClickListener {
            val intent = Intent(context, FichaDoDia::class.java)
            context.startActivity(intent)
        }

        btnProfile.setOnClickListener {
            val intent = Intent(context, PerfilAluno::class.java)
            context.startActivity(intent)
        }
    }
}
