package com.example.unigym

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity2 : AppCompatActivity() {
    lateinit var textviewNome: TextView
    lateinit var textviewCPF: TextView
    lateinit var btnVoltar:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        textviewNome = findViewById(R.id.NOME_receiver)
        textviewCPF = findViewById(R.id.CPF_receiver)
        btnVoltar = findViewById(R.id.button2)
    }

    override fun onStart() {
        super.onStart()

        textviewNome.text = intent.getStringExtra("MARCELO")
        textviewCPF.text = intent.getStringExtra("NELSON")

        btnVoltar.setOnClickListener {
            val intencao = Intent(this, MainActivity::class.java)
            startActivity(intencao)
        }

    }
}