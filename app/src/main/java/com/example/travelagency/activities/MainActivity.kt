package com.example.travelagency.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.travelagency.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSignIn: Button = findViewById(R.id.buttonSigIn)
        val buttonSignUp: Button = findViewById(R.id.buttonSignUp)
        buttonSignIn.setOnClickListener {
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }
        buttonSignUp.setOnClickListener {
            val intent = Intent(this@MainActivity, Registration::class.java)
            startActivity(intent)
        }
    }

}