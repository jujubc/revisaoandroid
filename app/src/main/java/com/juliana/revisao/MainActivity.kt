package com.juliana.revisao

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.juliana.revisao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            val login = binding.loginInput.text.toString().trim()
            val senha = binding.senhaInput.text.toString().trim()

            if (login == "admin" && senha == "1234") {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("LOGIN_USUARIO", login)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Login ou senha incorretos!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}