package com.example.login.Presenter

import com.example.login.Model.User
import com.example.login.View.iLoginView

class LoginPresenter(internal var ILoginView: iLoginView): iLoginPresenter {
    override fun onLogin(email: String, password: String) {
        val user = User(email,password)

        when(user.isDataValid()){
            0 -> ILoginView.onLoginFailed("Email must not be null")
            1 -> ILoginView.onLoginFailed("Wrong Email Address")
            2 -> ILoginView.onLoginFailed("Password must be greater than 6")
            else -> ILoginView.onLoginSuccess("Log in Success")

        }
    }


}