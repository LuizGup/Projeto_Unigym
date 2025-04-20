package com.example.unigym

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import android.view.LayoutInflater
import android.widget.ImageButton

class CriarOpcaoDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(requireContext()).inflate(R.layout.activity_criar_opcao_dialog, null)

        val btnExercicio = view.findViewById<ImageButton>(R.id.btnExercicio)
        val btnFicha = view.findViewById<ImageButton>(R.id.btnFicha)
        val btnCancelar = view.findViewById<ImageButton>(R.id.btnCancelar) // novo botão

        btnExercicio.setOnClickListener {
            // Ação ao clicar em "exercicio"
            dismiss()
        }

        btnFicha.setOnClickListener {
            // Ação ao clicar em "Ficha"
            dismiss()
        }

        btnCancelar.setOnClickListener {
            // Apenas fecha o dialog
            dismiss()
        }

        return AlertDialog.Builder(requireContext())
            .setView(view)
            .create()
    }
}
