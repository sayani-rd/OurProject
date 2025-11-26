package com.example.pro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        val signin = findViewById<TextView>(R.id.tvSignIn)

        signin.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}