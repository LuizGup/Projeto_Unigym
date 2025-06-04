package com.example.unigym.aluno

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.Toast
import com.example.unigym.R
import com.example.unigym.R.*

class DialogExcluirPerfilAluno : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(requireContext()).inflate(layout.activity_dialog_perfil_aluno_excluir_perfil, null)

        val btnConfirmarFicha = view.findViewById<ImageButton>(R.id.btnConfirmarFicha_excluir)
        val btnCancelar = view.findViewById<ImageButton>(R.id.btnCancelar)

        btnConfirmarFicha.setOnClickListener {
            Toast.makeText(requireContext(), "Sua conta foi excluida com sucesso!", Toast.LENGTH_LONG).show()
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