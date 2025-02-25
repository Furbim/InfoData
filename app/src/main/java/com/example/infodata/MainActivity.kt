package com.example.infodata

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnEnviar = findViewById<Button>(R.id.btn_enviar)
        val edtNome = findViewById<EditText>(R.id.edt_nome)
        val edtIdade = findViewById<EditText>(R.id.edt_idade)
        val edtEmail = findViewById<EditText>(R.id.edt_email)
        val edtCpf = findViewById<EditText>(R.id.edt_cpf)

        btnEnviar.setOnClickListener(){
            val tvInfo = findViewById<TextView>(R.id.tv_info)
            tvInfo.setText("Nome: ${edtNome.text} \n Idade: ${edtIdade.text} \n Email: ${edtEmail.text} \n CPF: ${edtCpf.text}")
        }
    }






}