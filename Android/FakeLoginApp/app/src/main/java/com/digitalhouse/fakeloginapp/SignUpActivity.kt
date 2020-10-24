package com.digitalhouse.fakeloginapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        ckbAgreement.setOnCheckedChangeListener { _, isChecked ->
            btnSignUp.isEnabled = isChecked
        }

        btnSignUp.setOnClickListener {
            val name = edtName.text.toString()
            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()

            if (name.isNotBlank() && email.isNotBlank() && password.isNotEmpty()) {
                try {
                    UserService.register(name, email, password)
                    Toast.makeText(this, getString(R.string.successfully_registered), Toast.LENGTH_SHORT).show()
                    finish()
                } catch (e: Exception) {
                    Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
                }
            } else {
                if (name.isBlank()) {
                    edtName.error = getString(R.string.field_required)
                }

                if (email.isBlank()) {
                    edtEmail.error = getString(R.string.field_required)
                }

                if (password.isEmpty()) {
                    edtPassword.error = getString(R.string.field_required)
                }
            }
        }

        btnLogIn.setOnClickListener {
            finish()
        }
    }
}