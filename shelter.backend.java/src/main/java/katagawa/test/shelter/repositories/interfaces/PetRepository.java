package katagawa.test.shelter.repositories.interfaces;

import katagawa.test.shelter.models.Pet;
import katagawa.test.shelter.models.AnimalType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>, CustomPetRepository {

    List<Pet> findByType(AnimalType type);

    Pet findByName(String name);
}
