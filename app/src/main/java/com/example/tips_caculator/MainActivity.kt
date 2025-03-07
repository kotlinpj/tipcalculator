package com.example.tips_caculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

const val KEY_MAIN_ACTIVITY = "Key_main_activity_inicial"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // essa linha chama a tela de layout

        // cricacao de variaveis para poder interagir com os campos da tela de layout
        val Total_Conta: TextInputEditText = findViewById(R.id.tie_conta)
        val Total_Pessoas: TextInputEditText = findViewById(R.id.tie_pessoas)
        val btn_Limpar: Button = findViewById(R.id.btn_limpar)
        val btn_Calcular: Button = findViewById(R.id.btn_calcular)

        btn_Limpar.setOnClickListener {
            Total_Pessoas.text?.clear() // limpa o campo total pessoas ao clicar no botao limpar
            Total_Conta.text?.clear() // limpa o campo total conta ao clicar no botao limpar
        }
        btn_Calcular.setOnClickListener {

            //if validando se os campos estao vazios
            if (Total_Conta.text.isNullOrEmpty() || Total_Pessoas.text.isNullOrEmpty()) {
                Snackbar.make(
                    Total_Pessoas,
                    "Preencha os campos",
                    Snackbar.LENGTH_SHORT
                ).show()
            }
        }

    }

}