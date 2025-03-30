package com.example.demo.entity;
import jakarta.persistence.*;
import java.util.Date;
@Entity
public class HealthRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String healthCondition;
    public String getHealthCondition() {
        return healthCondition;
    }
    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }
    public String getTreatment() {
        return treatment;
    }
    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    private String treatment;
    private Date date;

    // Getters and Setters
}

