package katagawa.test.shelter.config.dev;

import katagawa.test.shelter.factories.PetFactory;
import katagawa.test.shelter.models.Pet;
import katagawa.test.shelter.services.PetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DataInitializer {

    @Bean
    public CommandLineRunner seedDatabase(PetService petService, PetFactory petFactory) {
        return _ -> {
            for (int i = 0; i < 10; i++) {
                Pet randomPet = petFactory.createRandomPet();
                petService.savePet(randomPet);
            }
        };
    }
}
