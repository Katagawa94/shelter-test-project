package katagawa.test.shelter.repositories.interfaces;

import katagawa.test.shelter.models.Pet;
import katagawa.test.shelter.models.AnimalType;
import java.util.List;

public interface CustomPetRepository {
    List<Pet> findByTypeAndBirthDateIsCertainAndNameContaining(AnimalType type, boolean birthDateIsCertain, String keyword);
}
