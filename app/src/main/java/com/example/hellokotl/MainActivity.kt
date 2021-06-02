package com.example.hellokotl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.textView)
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            if (TextUtils.isEmpty(text.text)){
                text.text = "salam"
            }else{
                Toast.makeText(this, "I have been clicked", Toast.LENGTH_LONG).show()
                text.text = "salam2"
            }
        }
    }
}