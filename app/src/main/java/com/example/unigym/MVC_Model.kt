package com.example.unigym

import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MVC_Model {
    class PessoaModel {
        private val db = Firebase.firestore
        private val colecao = db.collection("pessoa")

        fun criarPessoa(
            nome: String,
            idade: Int,
            altura: Double,
            peso: Int,
            cidade: String
        ) {
            val pessoa = hashMapOf(
                "nome" to nome,
                "idade" to idade,
                "altura" to altura,
                "peso" to peso,
                "cidade" to cidade
            )

            colecao.add(pessoa)
                .addOnSuccessListener { docRef ->
                    Log.d("MODEL", "Pessoa criada com ID: ${docRef.id}")
                }
                .addOnFailureListener {
                    Log.e("MODEL", "Erro ao criar pessoa", it)
                }
        }

        fun lerPessoas() {
            colecao.get()
                .addOnSuccessListener { result ->
                    for (document in result) {
                        Log.d("MODEL", "${document.id} => ${document.data}")
                    }
                }
                .addOnFailureListener {
                    Log.e("MODEL", "Erro ao ler pessoas", it)
                }
        }

        fun atualizarPessoa(
            id: String,
            nome: String,
            idade: Int,
            altura: Double,
            peso: Int,
            cidade: String
        ) {
            colecao.document(id).update(
                "nome", nome,
                "idade", idade,
                "altura", altura,
                "peso", peso,
                "cidade", cidade
            ).addOnSuccessListener {
                Log.d("MODEL", "Pessoa atualizada com sucesso")
            }.addOnFailureListener {
                Log.e("MODEL", "Erro ao atualizar", it)
            }
        }

        fun deletarPessoa(id: String) {
            colecao.document(id).delete()
                .addOnSuccessListener {
                    Log.d("MODEL", "Pessoa deletada com sucesso")
                }
                .addOnFailureListener {
                    Log.e("MODEL", "Erro ao deletar", it)
                }
        }
    }
}