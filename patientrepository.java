package com.example.PatientManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PatientManagement.entity.patient;

public interface patientrepository extends JpaRepository<patient,Long>{

}
