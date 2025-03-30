package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Pet;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {
    List<Pet> findByAdoptionStatus(String status);
    List<Pet> findBySpecies(String species);
    List<Pet> findByBreed(String breed);
    @Query("SELECT p FROM Pet p WHERE p.age >= :minAge AND p.age <= :maxAge")
    List<Pet> findPetsByAgeRange(@Param("minAge") int minAge, @Param("maxAge") int maxAge);
}
