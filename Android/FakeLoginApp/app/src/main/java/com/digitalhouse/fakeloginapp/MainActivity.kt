package com.digitalhouse.fakeloginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtCreateAccount.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        btnLogIn.setOnClickListener {
            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()

            if (email.isNotBlank() && password.isNotEmpty()) {
                val user = UserService.logIn(email, password)
                if (user != null) {
                    val intent = Intent(this, WelcomeActivity::class.java)
                    intent.putExtra("NAME",user.name)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(
                        this,
                        getString(R.string.Invalid_email_password),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            } else {
                if (email.isBlank()) {
                    edtEmail.error = getString(R.string.field_required)
                }

                if (password.isEmpty()) {
                    edtPassword.error = getString(R.string.field_required)
                }
            }
        }
    }
}