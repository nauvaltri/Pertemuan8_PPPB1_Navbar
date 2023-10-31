package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.HomeFragment
import com.example.myfirstapp.MainActivity
import com.example.myfirstapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mendapatkan referensi ke tombol "login_btn" menggunakan ViewBinding
        val loginButton = binding.loginBtn

        // Menambahkan listener klik ke tombol "login_btn"
        loginButton.setOnClickListener {
            // Ketika tombol diklik, kita akan pindah ke Activity lain (activity_main)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
