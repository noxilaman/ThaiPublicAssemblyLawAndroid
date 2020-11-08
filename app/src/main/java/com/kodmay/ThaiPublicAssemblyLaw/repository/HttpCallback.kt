package com.kodmay.ThaiPublicAssemblyLaw.repository


interface HttpCallback<T> {
    fun onSuccess(data: T)
    fun onFailure(error: String)
}