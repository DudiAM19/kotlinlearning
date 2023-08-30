package com.example.myapplication

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
        binding.buttonAdd.setOnClickListener {
            Toast.makeText(this@MainActivity, editText.text.toString(), duration).show()
        }
    }
}