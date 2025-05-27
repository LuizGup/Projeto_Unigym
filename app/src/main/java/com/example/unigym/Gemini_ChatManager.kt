//package com.example.unigym
//
////import com.google.ai.client.generativeai.type.Content
////import com.google.ai.client.generativeai.type.content
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.withContext
//
//class Gemini_ChatManager {
//
//    object GeminiChatManager {
//
//        private val chat = GeminiClient.generativeModel.startChat(
//            history = listOf(
////                content(role = "user") { text("Olá!") },
////                content(role = "model") { text("Oi! Como posso te ajudar hoje?") }
//            )
//        )
//
//        suspend fun sendMessage(message: String): String {
//            return try {
//                val response = withContext(Dispatchers.IO) {
//                    chat.sendMessage(message)
//                }
//                response.text ?: "Sem resposta"
//            } catch (e: Exception) {
//                "Erro: ${e.message}"
//            }
//        }
//    }
//
//}