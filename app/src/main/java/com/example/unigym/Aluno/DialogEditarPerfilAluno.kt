package com.example.unigym.aluno

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.Toast
import com.example.unigym.R

class DialogEditarPerfilAluno : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(requireContext()).inflate(R.layout.activity_dialog_perfil_aluno_confirmar_editar, null)

        val btnConfirmarFicha = view.findViewById<ImageButton>(R.id.btnConfirmarFicha_aluno)
        val btnCancelar = view.findViewById<ImageButton>(R.id.btnCancelar) // novo botão

        btnConfirmarFicha.setOnClickListener {

            Toast.makeText(requireContext(), "Seus dados foram alterados com sucesso!", Toast.LENGTH_LONG).show()
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