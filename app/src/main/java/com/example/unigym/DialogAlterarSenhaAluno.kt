package com.example.unigym

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import android.view.LayoutInflater
import android.widget.ImageButton
import com.example.unigym.aluno.PerfilAluno

class DialogAlterarSenhaAluno : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(requireContext()).inflate(R.layout.activity_dialog_perfil_aluno_alterar_senha, null)

        val btnConfirmarFicha = view.findViewById<ImageButton>(R.id.btnConfirmarFicha)
        val btnCancelar = view.findViewById<ImageButton>(R.id.btnCancelar) // novo botão

        btnConfirmarFicha.setOnClickListener {
            // Ação ao clicar em "confirmar alterações"
            (activity as? PerfilAluno)?.mostrarNotificacaoAlteracao()
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