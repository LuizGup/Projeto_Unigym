package com.example.unigym

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import android.view.LayoutInflater
import android.widget.ImageButton
import com.example.unigym.aluno.TelaCadastro_Aluno

class Dialog_Cadastro_ProfouAluno : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(requireContext()).inflate(R.layout.activity_dialog_cadastro_profou_aluno, null)

        val btnprof = view.findViewById<ImageButton>(R.id.btncadastroprof)
        val btnaluno = view.findViewById<ImageButton>(R.id.btncadastroaluno)
        val btnCancelar = view.findViewById<ImageButton>(R.id.btnCancelar)

        btnprof.setOnClickListener {
            val intent = Intent(requireContext(), Tela_Cadastro_Professor::class.java)
            startActivity(intent)
            dismiss()
        }
        //

        btnaluno.setOnClickListener {
            val intent = Intent(requireContext(), TelaCadastro_Aluno::class.java)
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