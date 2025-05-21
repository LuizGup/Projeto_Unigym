package com.example.unigym

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import android.view.LayoutInflater
import android.widget.ImageButton
import com.example.unigym.aluno.HomePageAluno
import com.example.unigym.aluno.TelaCadastro_Aluno
import com.example.unigym.professor.Homepage_Professor

class Dialog_Login_ProfouAluno : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(requireContext()).inflate(R.layout.activity_dialog_login_profou_aluno, null)

        val btnLoginProfessor = view.findViewById<ImageButton>(R.id.btnLoginProfessor)
        val btnLoginAluno = view.findViewById<ImageButton>(R.id.btnLoginAluno)
        val btnCancelar = view.findViewById<ImageButton>(R.id.btnCancelar)

        btnLoginProfessor.setOnClickListener {
            val intent = Intent(requireContext(), Homepage_Professor::class.java)
            startActivity(intent)
            dismiss()
        }
        //

        btnLoginAluno.setOnClickListener {
            val intent = Intent(requireContext(), HomePageAluno::class.java)
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