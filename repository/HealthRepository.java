package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.HealthRecord;

import java.util.List;
public interface HealthRepository extends JpaRepository<HealthRecord, Long> {
List<HealthRecord> findByPetId(Long petId);
List<HealthRecord> findByHealthConditionContaining(String condition);
@Query("SELECT h FROM HealthRecord h WHERE h.date BETWEEN :startDate AND :endDate")
List<HealthRecord> findRecordsByDateRange(@Param("startDate") String startDate, @Param("endDate") String endDate);
}
