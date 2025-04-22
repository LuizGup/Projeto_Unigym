package com.example.unigym.professor

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.fragment.app.FragmentActivity
import com.example.unigym.R


@SuppressLint("CustomViewStyleable")
class ToolBarProfessorView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.activity_tool_bar_professor, this, true)

        // Lê o atributo personalizado
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.ToolBarView)
        val currentScreenName = typedArray.getString(R.styleable.ToolBarView_currentScreen)
        typedArray.recycle()

        val btnHome = findViewById<ImageButton>(R.id.btnHome)
        val btnCreate = findViewById<ImageButton>(R.id.btnCreate)
        val btnProfile = findViewById<ImageButton>(R.id.btnProfile)

        btnHome.setOnClickListener {
            if (currentScreenName != "Homepage_Professor") {
                val intent = Intent(context, Homepage_Professor::class.java)
                context.startActivity(intent)
            }
        }


        btnCreate.setOnClickListener {
            if (context is FragmentActivity) {
                val dialog = CriarOpcaoDialog()
                dialog.show((context as FragmentActivity).supportFragmentManager, "CriarOpcaoDialog")
            }
        }

        btnProfile.setOnClickListener {
            // ação futura
        }
    }
}
