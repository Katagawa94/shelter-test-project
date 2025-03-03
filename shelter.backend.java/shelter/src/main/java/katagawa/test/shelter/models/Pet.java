package katagawa.test.shelter.models;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
public class Pet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private AnimalType type;

    private String name;

    private Date birthDate;

    private boolean birthDateIsCertain;

    private Date shelterArrivalDate;

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBirthDateIsCertain() {
        return birthDateIsCertain;
    }

    public void setBirthDateIsCertain(boolean birthDateIsCertain) {
        this.birthDateIsCertain = birthDateIsCertain;
    }

    public Date getShelterArrivalDate() {
        return shelterArrivalDate;
    }

    public void setShelterArrivalDate(Date shelterArrivalDate) {
        this.shelterArrivalDate = shelterArrivalDate;
    }

    public Pet(){}

    public Pet(
        AnimalType type, 
        String name, 
        Date birthDate, 
        boolean birthDateIsCertain,
        Date shelterArrivalDate) {
        this.type = type;
        this.name = name;
        this.birthDate = birthDate;
        this.birthDateIsCertain = birthDateIsCertain;
        this.shelterArrivalDate = shelterArrivalDate;
    }
}
