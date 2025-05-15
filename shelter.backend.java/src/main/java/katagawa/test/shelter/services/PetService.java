package katagawa.test.shelter.services;

import katagawa.test.shelter.models.Pet;
import katagawa.test.shelter.repositories.interfaces.PetRepository;
import katagawa.test.shelter.models.AnimalType;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    public Optional<Pet> getPetById(Long id) {
        return petRepository.findById(id);
    }

    public Pet savePet(Pet pet) {
        return petRepository.save(pet);
    }

    public void deletePet(Long id) {
        petRepository.deleteById(id);
    }

    public List<Pet> getPetsByType(AnimalType type) {
        return petRepository.findByType(type); // Uses the custom query method
    }

    public Pet getPetByName(String name) {
        return petRepository.findByName(name);
    }
}
