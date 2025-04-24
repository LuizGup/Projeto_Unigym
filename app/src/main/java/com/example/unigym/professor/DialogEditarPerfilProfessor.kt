package com.example.unigym.professor

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.Toast
import com.example.unigym.R
import com.example.unigym.aluno.PerfilAlunoEditar

class DialogEditarPerfilProfessor : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(requireContext()).inflate(R.layout.activity_dialog_perfil_professor_confirmar_editar, null)

        val btnConfirmarFicha = view.findViewById<ImageButton>(R.id.btnConfirmarFicha)
        val btnCancelar = view.findViewById<ImageButton>(R.id.btnCancelar) // novo botão

        btnConfirmarFicha.setOnClickListener {
            // Ação ao clicar em "confirmar alterações"

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