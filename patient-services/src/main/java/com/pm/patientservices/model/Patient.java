package com.pm.patientservices.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID patientId;

    @NotNull
    private String patientName;

    @NotNull
    @Email
    @Column(unique = true)
    private String patientEmail;

    @NotNull
    private String patientAddress;

    @NotNull
    private LocalDate patientDob;

    @NotNull
    private LocalDate patientRegisteredDate;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public LocalDate getPatientDob() {
        return patientDob;
    }

    public void setPatientDob(LocalDate patientDob) {
        this.patientDob = patientDob;
    }

    public LocalDate getPatientRegisteredDate() {
        return patientRegisteredDate;
    }

    public void setPatientRegisteredDate(LocalDate patientRegisteredDate) {
        this.patientRegisteredDate = patientRegisteredDate;
    }

    public UUID getPatientId() {
        return patientId;
    }

    public void setPatientId(UUID patientId) {
        this.patientId = patientId;
    }
}
