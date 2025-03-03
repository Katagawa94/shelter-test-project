package katagawa.test.shelter.factories;

import katagawa.test.shelter.models.AnimalType;
import katagawa.test.shelter.models.Pet;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class PetFactory {

    public Pet createRandomPet() {
        AnimalType[] types = AnimalType.values();
        AnimalType randomType = types[ThreadLocalRandom.current().nextInt(types.length)];
        
        String[] names = {"Buddy", "Max", "Bella", "Charlie", "Molly", "Lucy", "Rocky", "Daisy", "Bailey", "Cooper"};
        String randomName = names[ThreadLocalRandom.current().nextInt(names.length)];
        
        LocalDate startBirth = LocalDate.of(2010, 1, 1);
        LocalDate endBirth = LocalDate.of(2020, 12, 31);
        long randomBirthEpochDay = ThreadLocalRandom.current().nextLong(startBirth.toEpochDay(), endBirth.toEpochDay() + 1);
        Date birthDate = Date.valueOf(LocalDate.ofEpochDay(randomBirthEpochDay));
        
        boolean birthDateIsCertain = ThreadLocalRandom.current().nextBoolean();
        
        LocalDate startShelter = LocalDate.of(2021, 1, 1);
        LocalDate endShelter = LocalDate.now();
        long randomShelterEpochDay = ThreadLocalRandom.current().nextLong(startShelter.toEpochDay(), endShelter.toEpochDay() + 1);
        Date shelterArrivalDate = Date.valueOf(LocalDate.ofEpochDay(randomShelterEpochDay));
        
        return new Pet(randomType, randomName, birthDate, birthDateIsCertain, shelterArrivalDate);
    }
}
