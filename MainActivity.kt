package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to UI elements
        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val resultView = findViewById<TextView>(R.id.resultView)

        val addButton = findViewById<Button>(R.id.addButton)
        val subButton = findViewById<Button>(R.id.subButton)
        val mulButton = findViewById<Button>(R.id.mulButton)
        val divButton = findViewById<Button>(R.id.divButton)

        // Addition
        addButton.setOnClickListener {
            val number1 = num1.text.toString().toDoubleOrNull()
            val number2 = num2.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null) {
                val result = number1 + number2
                resultView.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        // Subtraction
        subButton.setOnClickListener {
            val number1 = num1.text.toString().toDoubleOrNull()
            val number2 = num2.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null) {
                val result = number1 - number2
                resultView.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        // Multiplication
        mulButton.setOnClickListener {
            val number1 = num1.text.toString().toDoubleOrNull()
            val number2 = num2.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null) {
                val result = number1 * number2
                resultView.text = "Result: $result"
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }

        // Division
        divButton.setOnClickListener {
            val number1 = num1.text.toString().toDoubleOrNull()
            val number2 = num2.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null) {
                if (number2 != 0.0) {
                    val result = number1 / number2
                    resultView.text = "Result: $result"
                } else {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
