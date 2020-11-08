package com.kodmay.ThaiPublicAssemblyLaw.repository

interface HttpVoidCallback {
    fun onSuccess()
    fun onFailure(error: String)
}