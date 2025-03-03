package com.katagawa.shelter.backend.datasource.mock

import com.katagawa.shelter.backend.datasource.IAnimalDataSource
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AnimalDataSourceTest {

    @Autowired
    private lateinit var repository: IAnimalDataSource

    @Test
    fun `should provide a collection of Animals`() {
        // act
        val animals = repository.getAnimal()

        // assert
        assertThat(animals).isNotNull()
    }
}