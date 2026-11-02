package com.example.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital {

    private Doctor doctor;
    private Patient patient;
    private Department department;

    @Autowired
    public Hospital(Doctor doctor, Patient patient,
                   Department department) {

        this.doctor = doctor;
        this.patient = patient;
        this.department = department;
    }

    public void displayHospital() {

        System.out.println("Welcome to City Hospital");

        doctor.displayDoctor();
        patient.displayPatient();
        department.displayDepartment();

        System.out.println("Hospital information loaded successfully!");
    }
}