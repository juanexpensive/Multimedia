package com.example.prueba2
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.prueba2.databinding.ActivityMainBinding


    class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            val binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            Log.d("MainActivity", "onCreate")



            binding.btnLogin.setOnClickListener {
                var username = binding.etUsuario.text.toString()
                var password = binding.etContrasena.text.toString()

                if (username == "admin" && password == "1234"){

                    val intent = Intent(this, NextActivity::class.java)
                    intent.putExtra("username", username)
                    startActivity(intent)
                }   else {
                    Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
                }

            }
            }
            override fun onStart() {
                super.onStart()
                Log.d("MainActivity", "onStart")
            }

            override fun onResume() {
                super.onResume()
                Log.d("MainActivity", "onResume")
            }

            override fun onPause() {
                super.onPause()
                Log.d("MainActivity", "onPause")
            }

            override fun onStop() {
                super.onStop()
                Log.d("MainActivity", "onStop")
            }

        override fun onDestroy() {
            super.onDestroy()
            Log.d("MainActivity", "onDestroy")
        }

        }

