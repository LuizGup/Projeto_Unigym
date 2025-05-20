package com.example.unigym

import android.util.Log
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MVC_Model {

    class UsuarioCadastro {
        private val db = Firebase.firestore
        private val colecao = db.collection("pessoa")

        fun cadastrarPessoa(
            nome: String,
            email: String,
            senha: String,
            onSuccess: () -> Unit,
            onFailure: (Exception) -> Unit
        ) {
            val pessoa = hashMapOf(
                "nome" to nome,
                "email" to email,
                "senha" to senha
            )

            colecao.add(pessoa)
                .addOnSuccessListener {
                    Log.d("MODEL", "Pessoa cadastrada com ID: ${it.id}")
                    onSuccess()
                }
                .addOnFailureListener { ex ->
                    Log.e("MODEL", "Erro ao cadastrar", ex)
                    onFailure(ex)
                }
        }
    }

    class UsuarioLogin {
        private val db = Firebase.firestore
        private val colecao = db.collection("pessoa")

        fun logar(
            email: String,
            senha: String,
            onResult: (Boolean, DocumentSnapshot?) -> Unit
        ) {
            colecao.whereEqualTo("email", email).get()
                .addOnSuccessListener { result ->
                    if (result.isEmpty) {
                        onResult(false, null)
                    } else {
                        val doc = result.documents[0]
                        val senhaArmazenada = doc.getString("senha")
                        if (senhaArmazenada == senha) {
                            onResult(true, doc)
                        } else {
                            onResult(false, null)
                        }
                    }
                }
                .addOnFailureListener {
                    Log.e("MODEL", "Erro ao logar", it)
                    onResult(false, null)
                }
        }
    }
}
