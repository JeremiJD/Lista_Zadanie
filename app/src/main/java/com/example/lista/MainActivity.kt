package com.example.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckedTextView
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val milk = findViewById<CheckedTextView>(R.id.Mleko)
        val bread = findViewById<CheckedTextView>(R.id.Chleb)
        val sugar = findViewById<CheckedTextView>(R.id.Cukier)
        val tea = findViewById<CheckedTextView>(R.id.Herbata)
        val butter = findViewById<CheckedTextView>(R.id.Maslo)

        findViewById<Button>(R.id.Add_btn).setOnClickListener {
            if (milk.isChecked) {
                findViewById<TextView>(R.id.Lista_txt).text.toString() + "\n  Mleko"
            }
            else if (bread.isChecked){
                findViewById<TextView>(R.id.Lista_txt).text.toString() + "\n  Chleb"
            }
            else if (sugar.isChecked){
                findViewById<TextView>(R.id.Lista_txt).text.toString() + "\n  Cukier"
            }
            else if (tea.isChecked){
                findViewById<TextView>(R.id.Lista_txt).text.toString() + "\n  Herbata"
            }
            else if (butter.isChecked){
                findViewById<TextView>(R.id.Lista_txt).text.toString() + "\n  Masło"
            }
        }
    }
}

