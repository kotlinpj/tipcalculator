package com.example.tips_caculator

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val  KEY_RESULT_GORJETA = "ResultActivity.key_GORJETA"
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(KEY_RESULT_GORJETA,0f)
        val resultado: TextView = findViewById(R.id.tv_result)
        resultado.text = " O valor da gorjeta é: " + result.toString()

    }
}