package com.katagawa.shelter.backend.controller

import com.katagawa.shelter.backend.model.Animal
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/animals")
class AnimalController {

    @GetMapping
    fun getAnimals(): Collection<Animal> {
        return listOf()
    }
}