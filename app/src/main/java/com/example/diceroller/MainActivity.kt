package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainlayout)
        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener {
            val resultTextView: TextView = findViewById(R.id.textView2)
            val randomNumber = (1..6).random()
            resultTextView.text = randomNumber.toString()
        }
    }

}
