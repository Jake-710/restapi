package com.example.demo.controller;

import com.example.demo.entity.HealthRecord;
import com.example.demo.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/health-records")
public class HealthController {

    @Autowired
    private HealthService healthService;

    @PostMapping
    public ResponseEntity<HealthRecord> createHealthRecord(@RequestBody HealthRecord healthRecord) {
        return ResponseEntity.status(201).body(healthService.createHealthRecord(healthRecord));
    }

    @GetMapping
    public ResponseEntity<List<HealthRecord>> getAllHealthRecords() {
        return ResponseEntity.ok(healthService.getAllHealthRecords());
    }

    @GetMapping("/{id}")
    public ResponseEntity<HealthRecord> getHealthRecordById(@PathVariable Long id) {
        return healthService.getHealthRecordById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/pet/{petId}")
    public ResponseEntity<List<HealthRecord>> getHealthRecordsByPetId(@PathVariable Long petId) {
        return ResponseEntity.ok(healthService.getHealthRecordsByPetId(petId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHealthRecord(@PathVariable Long id) {
        healthService.deleteHealthRecord(id);
        return ResponseEntity.noContent().build();
    }
}
