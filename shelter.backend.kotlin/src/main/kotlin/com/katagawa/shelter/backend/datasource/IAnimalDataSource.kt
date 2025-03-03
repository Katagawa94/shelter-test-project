package com.katagawa.shelter.backend.datasource

import com.katagawa.shelter.backend.model.Animal

interface IAnimalDataSource {

    fun getAnimal(): Collection<Animal>

    fun getAnimalById(id: Int): Animal

    fun getAnimalsByName(name: String): Collection<Animal>

    fun getAnimalsByType(type: String): Collection<Animal>

}