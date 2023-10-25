package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextMoney = findViewById<EditText>(R.id.editTextMoney)
        val buttonAmazing = findViewById<Button>(R.id.buttonAmazing)
        val buttonGood = findViewById<Button>(R.id.buttonGood)
        val buttonOkay = findViewById<Button>(R.id.buttonOkay)
        val buttonCalculate = findViewById<Button>(R.id.buttonCalculate)

        var tipPercentage = 0.0

        buttonAmazing.setOnClickListener { tipPercentage = 0.20 }
        buttonGood.setOnClickListener { tipPercentage = 0.18 }
        buttonOkay.setOnClickListener { tipPercentage = 0.15 }

        buttonCalculate.setOnClickListener {
            val money = editTextMoney.text.toString().toDoubleOrNull()
            if (money != null) {
                val tip = money * tipPercentage
                Toast.makeText(this, "Tip amount: $tip", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please enter a valid amount", Toast.LENGTH_LONG).show()
            }
        }
    }
}
