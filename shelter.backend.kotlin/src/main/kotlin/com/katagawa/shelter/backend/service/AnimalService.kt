package com.katagawa.shelter.backend.service

import com.katagawa.shelter.backend.datasource.IAnimalDataSource
import com.katagawa.shelter.backend.model.Animal
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AnimalService {

    @Autowired
    lateinit var animalDataSource: IAnimalDataSource

    fun getAnimal(): Collection<Animal>{
        val animalList = animalDataSource.getAnimal()
        return  animalList
    }
}