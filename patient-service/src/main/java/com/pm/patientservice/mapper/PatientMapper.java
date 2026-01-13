package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient){
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
        patientResponseDTO.setId(patient.getPatientId().toString());
        patientResponseDTO.setName(patient.getPatientName());
        patientResponseDTO.setAddress(patient.getPatientAddress());
        patientResponseDTO.setEmail(patient.getPatientEmail());
        patientResponseDTO.setDateOfBirth(patient.getPatientDob().toString());

        return patientResponseDTO;
    }
}
