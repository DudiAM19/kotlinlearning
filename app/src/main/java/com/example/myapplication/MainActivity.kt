package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        editText = findViewById(R.id.text_value)
        val duration = Toast.LENGTH_SHORT

        val intent = Intent(this@MainActivity, Screen2::class.java)
        binding.buttonAdd.setOnClickListener {
            startActivity(intent)
        }
    }
}