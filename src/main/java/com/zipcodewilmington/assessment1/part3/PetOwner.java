package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name;
    Pet[] pets = new Pet[0];
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if (pets != null) {
            this.pets = pets.clone();
            setOwner(this.pets);
        }
    }

    public void setOwner (Pet... pets) {
        for(Pet currentPet : pets) {
            currentPet.setOwner(this);
        }
    }

    /**
     * @param array to be added to the composite collection of Pets
     */

    public List<Pet> convertToList(Pet[] array) {
        return new ArrayList<>(Arrays.asList(pets));
    }

    public Pet[] convertFromList(List<Pet> list) {
        return list.toArray(new Pet[list.size()]);
    }
    public void addPet(Pet pet) {
        List<Pet> listPets = convertToList(pets);
        listPets.add(pet);
        this.pets = convertFromList(listPets);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        List<Pet> listPets = convertToList(pets);
        listPets.remove(pet);
        if(convertFromList(listPets).length > 0) {
            this.pets = convertFromList(listPets);
        } else {
            this.pets = new Pet[1];
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        List<Pet> listPets = convertToList(pets);
        return listPets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Pet youngest = pets[0];
        for (Pet currentPet : pets) {
            if (currentPet.getAge() < youngest.getAge()) {
                youngest = currentPet;
            }
        }
        return youngest.getAge();
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Pet oldest = pets[0];
        for (Pet currentPet : pets) {
            if (currentPet.getAge() > oldest.getAge()) {
                oldest = currentPet;
            }
        }
        return oldest.getAge();
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int total = 0;
        for (Pet currentPet : pets) {
            total += currentPet.getAge();
        }
        return (float)total/pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
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
        if(pets.length > 0) {
            return pets;
        } else {
            return null;
        }
    }
}
