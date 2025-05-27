//package com.example.unigym
//
//import android.os.Bundle
//import android.widget.*
//import androidx.appcompat.app.AppCompatActivity
//import kotlinx.coroutines.*
//
//class GeminiActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_gemini)
//
//        val editText = findViewById<EditText>(R.id.editPrompt)
//        val button = findViewById<Button>(R.id.btnEnviar)
//        val resposta = findViewById<TextView>(R.id.txtResposta)
//
//        button.setOnClickListener {
//            val prompt = editText.text.toString()
//            CoroutineScope(Dispatchers.Main).launch {
//                resposta.text = "Aguarde..."
//                val output = Gemini_ChatManager.GeminiChatManager.sendMessage(prompt)
//                resposta.text = output
//            }
//        }
//    }
//}
