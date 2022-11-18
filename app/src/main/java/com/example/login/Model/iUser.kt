package com.example.login.Model

interface iUser {
    val email : String
    val password: String
    fun isDataValid(): Int

}