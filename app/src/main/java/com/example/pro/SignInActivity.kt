package com.example.pro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signup = findViewById<TextView>(R.id.tvSignUp)

        signup.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}