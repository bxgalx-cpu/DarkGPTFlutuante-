package com.example.darkgptflutuante

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.darkgptflutuante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.titleText.text = "DarkGPTFlutuante"
        binding.subtitleText.text = "Aplicativo Android inicial criado para compilar." 

        binding.actionButton.setOnClickListener {
            binding.subtitleText.text = "APK gerada com sucesso!"
        }
    }
}
