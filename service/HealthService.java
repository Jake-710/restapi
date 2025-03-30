package com.example.demo.service;

import com.example.demo.entity.HealthRecord;
import com.example.demo.repository.HealthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HealthService {

    @Autowired
    private HealthRepository healthRepository;

    public List<HealthRecord> getAllHealthRecords() {
        return healthRepository.findAll();
    }

    public List<HealthRecord> getHealthRecordsByPetId(Long petId) {
        return healthRepository.findByPetId(petId);
    }

    public Optional<HealthRecord> getHealthRecordById(Long id) {
        return healthRepository.findById(id);
    }

    public HealthRecord createHealthRecord(HealthRecord healthRecord) {
        return healthRepository.save(healthRecord);
    }

    public void deleteHealthRecord(Long id) {
        healthRepository.deleteById(id);
    }
}
