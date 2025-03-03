package katagawa.test.shelter.controllers;

import katagawa.test.shelter.models.Pet;
import katagawa.test.shelter.models.AnimalType;
import katagawa.test.shelter.services.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pets")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public List<Pet> getAllPets() {
        return petService.getAllPets();
    }

    @GetMapping("/{id}")
    public Optional<Pet> getPetById(@PathVariable Long id) {
        return petService.getPetById(id);
    }

    @GetMapping("/by-type")
    public List<Pet> getPetsByType(@RequestParam AnimalType type) {
        return petService.getPetsByType(type);
    }

    @GetMapping("/by-name")
    public Pet getPetByName(@RequestParam String name) {
        return petService.getPetByName(name);
    }

    @PostMapping
    public Pet addPet(@RequestBody Pet pet) {
        return petService.savePet(pet);
    }

    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable Long id) {
        petService.deletePet(id);
    }
}
