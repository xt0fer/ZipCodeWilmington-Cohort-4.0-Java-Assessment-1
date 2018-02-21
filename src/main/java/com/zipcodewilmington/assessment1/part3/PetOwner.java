package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name;
    ArrayList<Pet> petsOwned;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if (pets == null) {
            this.petsOwned = null;
        } else {
            for (Pet p : pets) {
                this.addPet(p);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if (this.petsOwned == null) {
            this.petsOwned = new ArrayList<Pet>();
        }
        this.petsOwned.add(pet);
        pet.setOwner(this);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        this.petsOwned.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return this.petsOwned.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungestPetAge() {
        Integer youngestAge = Integer.MAX_VALUE;
        for (Pet p : this.petsOwned) {
            if (p.getAge() < youngestAge ) {
                youngestAge = p.getAge();
            }
        }
        return youngestAge;
    }

    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldestAge = 0;
        for (Pet p : this.petsOwned) {
            if (p.getAge() > oldestAge ) {
                oldestAge = p.getAge();
            }
        }
        return oldestAge;

    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer ageSum = 0;
        for (Pet p : this.petsOwned) {
            ageSum += p.getAge();
        }
        return ageSum / (float) getNumberOfPets();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        if (this.petsOwned == null) return 0;
        return this.petsOwned.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        //if (this.petsOwned == null) return null;
        if (this.petsOwned.size() == 0) return new Pet[1];
        return this.petsOwned.toArray(new Pet[this.petsOwned.size()]);
//        Integer sz = this.petsOwned.size();
//        Pet[] p = new Pet[sz];
//        Integer i = 0;
//        for (Pet tp : this.petsOwned) {
//            p[i] = tp;
//            i++;
//        }
//        return p;
    }
}
