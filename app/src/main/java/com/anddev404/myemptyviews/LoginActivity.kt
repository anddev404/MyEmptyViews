package com.anddev404.myemptyviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val signIn = findViewById<TextView>(R.id.sigh_in_button)
        val forgotPassword = findViewById<TextView>(R.id.forgot_password_textview)
        val sighUp = findViewById<TextView>(R.id.sign_up_textview)

        signIn.setOnClickListener {
            Toast.makeText(this, getString(R.string.clicked_sign_in), Toast.LENGTH_LONG).show()
        }
        forgotPassword.setOnClickListener {
            Toast.makeText(this, getString(R.string.clicked_forgot_password), Toast.LENGTH_LONG)
                .show()
        }
        sighUp.setOnClickListener {
            Toast.makeText(this, getString(R.string.clicked_sign_up), Toast.LENGTH_LONG).show()
        }
    }
}