package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.login.Presenter.LoginPresenter
import com.example.login.Presenter.iLoginPresenter
import com.example.login.View.iLoginView
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), iLoginView {

    internal lateinit var loginPresenter: iLoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val username = findViewById<EditText>(R.id.etUsername)
        val password = findViewById<EditText>(R.id.etPassword)

        loginPresenter = LoginPresenter(this)

        btnLogin.setOnClickListener {
            loginPresenter.onLogin(username.text.toString(), password.text.toString())
        }
    }

    override fun onLoginSuccess(message: String) {
        Toast.makeText(applicationContext,message,Toast.LENGTH_SHORT).show()
    }

    override fun onLoginFailed(message: String) {
        Toast.makeText(applicationContext,message,Toast.LENGTH_SHORT).show()
    }


}