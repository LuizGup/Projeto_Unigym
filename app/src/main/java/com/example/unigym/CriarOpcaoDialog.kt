package com.example.unigym

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import android.view.LayoutInflater
import android.widget.ImageButton

class CriarOpcaoDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(requireContext()).inflate(R.layout.activity_criar_opcao_dialog, null)

        val btnExercicio = view.findViewById<ImageButton>(R.id.btnConfirmarFicha)
        val btnFicha = view.findViewById<ImageButton>(R.id.btnFicha)
        val btnCancelar = view.findViewById<ImageButton>(R.id.btnCancelar)

        btnExercicio.setOnClickListener {
            val intent = Intent(requireContext(), CriarExercicio_Professor::class.java)
            startActivity(intent)
            dismiss()
        }

        btnFicha.setOnClickListener {
            val intent = Intent(requireContext(), CriarFicha_Professor::class.java)
            startActivity(intent)
            dismiss()
        }

        btnCancelar.setOnClickListener {
            dismiss()
        }

        return AlertDialog.Builder(requireContext())
            .setView(view)
            .create()
    }
}
