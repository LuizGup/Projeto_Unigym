package com.example.unigym

import android.content.Context
import android.content.Intent
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class ReturnView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : LinearLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.view_return, this, true)

        val btnReturn = findViewById<ImageButton>(R.id.btnReturn)

        // Lê o atributo personalizado
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.ReturnView)
        val returnActivityName = typedArray.getString(R.styleable.ReturnView_returnActivity)
        typedArray.recycle()

        btnReturn.setOnClickListener {
            try {
                if (!returnActivityName.isNullOrEmpty()) {
                    val clazz = Class.forName(returnActivityName)
                    val intent = Intent(context, clazz)
                    context.startActivity(intent)
                } else {
                    // fallback: volta para a tela anterior
                    if (context is AppCompatActivity) {
                        (context as AppCompatActivity).finish()
                    }
                }
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            }
        }
    }
}
