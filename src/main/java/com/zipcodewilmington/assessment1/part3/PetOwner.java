package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    private List<Pet> pets = new ArrayList<>();
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if (pets != null) {
            this.pets = new ArrayList<>(Arrays.asList(pets));
            for(Pet pet : pets) {
                pet.setOwner(this);
            }
        }
    }


    /**
     * @param pet to be added to the composite collection of Pets
     */

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
           pets.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return pets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Collections.sort(pets);
        return pets.get(0).getAge();
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Collections.sort(pets);
        return pets.get(pets.size() - 1).getAge();
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int total = 0;
        for (Pet currentPet : pets) {
            total += currentPet.getAge();
        }
        return (float)total/pets.size();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        if(pets.size() > 0) {
            return pets.toArray(new Pet[0]);
        } else {
            return new Pet[1];
        }
    }
}
