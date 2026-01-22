package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TEXT = "text_to_display"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.LayoutPrincipal)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val submitButton: Button = findViewById(R.id.submit_button)
        val textView: TextView = findViewById(R.id.textView)
        val editText: EditText = findViewById(R.id.editTextText)

        submitButton.setOnClickListener {
            textView.text = editText.text

            if (editText.text.toString() == "afficher nouveau textView") {
                val layoutPrincipal : ConstraintLayout = findViewById(R.id.LayoutPrincipal)
                val deuxiemeTextView = TextView(this)
                deuxiemeTextView.text = "nouveau textView"
                layoutPrincipal.addView(deuxiemeTextView)
            }
        }

        val button: Button = findViewById(R.id.buttonNextView)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra(EXTRA_TEXT, editText.text.toString())
            startActivity(intent)
        }
    }
}