package com.kodmay.ThaiPublicAssemblyLaw.repository.model


data class UserResponse(
    val userId: Int,
    val message: String,
    val result: Boolean
)