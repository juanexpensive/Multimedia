package com.example.prueba2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.prueba2.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityNextBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_next)
        val username = intent.getStringExtra("username")
        binding.twWelcome.text = "!Bienvenido, $username"

        binding.btnExplorer.setOnClickListener {
            var texto = binding.etEverything.text.toString()
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = "https://www.google.com/search?q=${texto}".toUri()

        }
        binding.btnPhone.setOnClickListener {
            var telefono = binding.etEverything.text.toString()
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = "tel:${telefono}".toUri()

        }
        binding.btnMessage.setOnClickListener {
            val smsIntent = Intent(Intent.ACTION_VIEW)
            smsIntent.data = Uri.parse("sms:")
            smsIntent.putExtra("sms_body", "Hola")
            startActivity(smsIntent)
        }
        binding.btnShareText.setOnClickListener {
            var texto = binding.etEverything.text.toString()
            val shareIntent = Intent(Intent.ACTION_SEND)


        }
    }
}