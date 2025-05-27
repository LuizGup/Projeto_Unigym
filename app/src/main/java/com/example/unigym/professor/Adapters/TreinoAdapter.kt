package com.example.unigym.professor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.unigym.R

data class Treino(val titulo: String)

class TreinoAdapter(private val lista: List<Treino>) :
    RecyclerView.Adapter<TreinoAdapter.TreinoViewHolder>() {

    class TreinoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titulo: TextView = view.findViewById(R.id.tituloTreino)
        val btnEditar: TextView = view.findViewById(R.id.btnEditar)
        val btnApagar: TextView = view.findViewById(R.id.btnApagar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TreinoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_treino, parent, false)
        return TreinoViewHolder(view)
    }

    override fun getItemCount(): Int = lista.size

    override fun onBindViewHolder(holder: TreinoViewHolder, position: Int) {
        val treino = lista[position]
        holder.titulo.text = treino.titulo
        holder.btnEditar.setOnClickListener {
            // TODO: ação de editar treino
        }
        holder.btnApagar.setOnClickListener {
            // TODO: ação de apagar treino
        }
    }
}
