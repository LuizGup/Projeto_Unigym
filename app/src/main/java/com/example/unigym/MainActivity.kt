package com.example.unigym

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var NomeField: EditText
    lateinit var CPFfield: EditText
    lateinit var EnviarButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NomeField = findViewById(R.id.NomeField)
        CPFfield = findViewById(R.id.CPF_field)
        EnviarButton = findViewById(R.id.button)
    }

    override fun onStart() {
        super.onStart()
        EnviarButton.setOnClickListener {
            val intencao = Intent(this, MainActivity2::class.java)
            intencao.putExtra("MARCELO", NomeField.text.toString())
            intencao.putExtra("NELSON", CPFfield.text.toString())
            startActivity(intencao)
        }

    }
}
