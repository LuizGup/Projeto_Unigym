package com.example.unigym
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.ai.client.generativeai.GenerativeModel
import kotlinx.coroutines.launch

class Gemini_Activty : AppCompatActivity() { // Renomeie se necessário

    private lateinit var etUserInput: EditText
    private lateinit var btnSend: Button
    private lateinit var tvResponse: TextView
    private lateinit var progressBar: ProgressBar

    // Substitua "YOUR_API_KEY" pela sua chave de API real
    // Considere armazenar a chave de forma segura (não diretamente no código)
    private val apiKey = "AIzaSyBylaNNt99ps5NlJmWL13W9-Ekqk8lUp1I"

    // Escolha o modelo Gemini apropriado (ex: "gemini-1.5-flash")
    private val modelName = "gemini-1.5-flash"

    private lateinit var generativeModel: GenerativeModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gemini) // Certifique-se que o nome do layout está correto

        etUserInput = findViewById(R.id.etUserInput)
        btnSend = findViewById(R.id.btnSend)
        tvResponse = findViewById(R.id.tvResponse)
        progressBar = findViewById(R.id.progressBar)

        // Inicializa o modelo Generative AI
        try {
            generativeModel = GenerativeModel(
                modelName = modelName,
                apiKey = apiKey
            )
        } catch (e: Exception) {
            handleError("Erro ao inicializar o modelo Gemini: ${e.message}")
            // Desabilita o botão se a inicialização falhar
            btnSend.isEnabled = false
            return
        }

        btnSend.setOnClickListener {
            val userInput = etUserInput.text.toString().trim()
            if (userInput.isNotEmpty()) {
                sendMessageToGemini(userInput)
            } else {
                Toast.makeText(this, "Por favor, digite sua pergunta.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun sendMessageToGemini(prompt: String) {
        // Limpa a resposta anterior e mostra o progresso
        tvResponse.text = ""
        progressBar.visibility = View.VISIBLE
        btnSend.isEnabled = false
        etUserInput.isEnabled = false

        // Adiciona contexto de chatbot de academia e tom amigável
        val fullPrompt = "Você é um chatbot de academia amigável. Responda à seguinte pergunta sobre exercícios, academia ou dicas de alimentação: \n\n$prompt"

        lifecycleScope.launch {
            try {
                val response = generativeModel.generateContent(fullPrompt)
                tvResponse.text = response.text
            } catch (e: Exception) {
                handleError("Erro ao gerar resposta: ${e.message}")
            } finally {
                // Esconde o progresso e reabilita os controles
                progressBar.visibility = View.GONE
                btnSend.isEnabled = true
                etUserInput.isEnabled = true
                etUserInput.text.clear() // Limpa o campo de entrada após o envio
            }
        }
    }

    private fun handleError(errorMessage: String) {
        tvResponse.text = "Erro: $errorMessage"
        Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show()
        // Garante que a barra de progresso seja escondida em caso de erro
        progressBar.visibility = View.GONE
        btnSend.isEnabled = true
        etUserInput.isEnabled = true
    }
}