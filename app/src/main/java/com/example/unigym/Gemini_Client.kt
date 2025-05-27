package com.example.unigym

import com.google.ai.client.generativeai.GenerativeModel

class GeminiClient {
    companion object {
        private const val API_KEY = "AIzaSyBylaNNt99ps5NlJmWL13W9-Ekqk8lUp1I"


        val generativeModel: GenerativeModel by lazy {
            GenerativeModel(
                modelName = "gemini-pro",
                apiKey = (API_KEY)
            )
        }
    } }