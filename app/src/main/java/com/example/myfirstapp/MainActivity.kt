package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate layout menggunakan View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            // Ganti fragmen awal dengan HomeFragment
            replaceFragment(NotificationFragment())

            // Atur pendengar untuk BottomNavigationView
            bottomNavbar.setOnItemSelectedListener { item ->
                // Tangani pemilihan item
                when (item.itemId) {
//                    R.id.home -> {
//                        // Ganti fragmen saat ini dengan HomeFragment
//                        replaceFragment(HomeFragment())
//                    }
                    R.id.Movie -> {
                        // Ganti fragmen saat ini dengan NotificationFragment
                        replaceFragment(NotificationFragment())
                    }
                    R.id.Profile -> {
                        // Ganti fragmen saat ini dengan ProfileFragment
                        replaceFragment(ProfileFragment())
                    }
                }
                true // Mengembalikan true untuk menunjukkan bahwa pemilihan item telah ditangani
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        // Ganti fragmen dalam FrameLayout dengan fragmen yang diberikan
        fragmentTransaction.replace(R.id.frame_layout, fragment)

        // Lakukan transaksi untuk menerapkan penggantian fragmen
        fragmentTransaction.commit()
    }
}