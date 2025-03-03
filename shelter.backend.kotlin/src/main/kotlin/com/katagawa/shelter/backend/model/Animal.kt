package com.katagawa.shelter.backend.model

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Model for a shelter animal.")
data class Animal(
    val name: String,
    val age: Int,
    val id: String
)
