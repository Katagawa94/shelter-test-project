package com.katagawa.shelter.backend.datasource.mock

import com.katagawa.shelter.backend.model.Animal
import com.katagawa.shelter.backend.datasource.IAnimalDataSource
import org.springframework.stereotype.Repository

@Repository
class AnimalDataSourceMock : IAnimalDataSource {

    override fun getAnimal(): Collection<Animal> {
        return listOf()
    }

    override fun getAnimalById(id: Int): Animal {
        TODO("Not yet implemented")
    }

    override fun getAnimalsByName(name: String): Collection<Animal> {
        TODO("Not yet implemented")
    }

    override fun getAnimalsByType(type: String): Collection<Animal> {
        TODO("Not yet implemented")
    }
}