package katagawa.test.shelter.repositories.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import katagawa.test.shelter.models.Pet;
import katagawa.test.shelter.repositories.interfaces.CustomPetRepository;
import katagawa.test.shelter.models.AnimalType;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CustomPetRepositoryImpl implements CustomPetRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Pet> findByTypeAndBirthDateIsCertainAndNameContaining(AnimalType type, boolean birthDateIsCertain, String keyword) {
        String jpql = "SELECT p FROM Pet p WHERE p.type = :type " +
                      "AND p.birthDateIsCertain = :birthDateIsCertain " +
                      "AND LOWER(p.name) LIKE LOWER(:keyword)";
        
        TypedQuery<Pet> query = entityManager.createQuery(jpql, Pet.class);
        query.setParameter("type", type);
        query.setParameter("birthDateIsCertain", birthDateIsCertain);
        query.setParameter("keyword", "%" + keyword + "%");
        
        return query.getResultList();
    }
}
