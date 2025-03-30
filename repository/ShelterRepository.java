package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.entity.Shelter;

import java.util.List;
import java.util.Optional;

public interface ShelterRepository extends JpaRepository<Shelter, Long> {
    Optional<Shelter> findByName(String name);
    List<Shelter> findByAddressContaining(String city);
    @Query("SELECT s FROM Shelter s ORDER BY size(s.pets) DESC")
    List<Shelter> findSheltersByPetCountDesc();
}
