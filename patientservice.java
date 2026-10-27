package com.example.PatientManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PatientManagement.entity.patient;
import com.example.PatientManagement.repository.patientrepository;

@Service
public class patientservice {
@Autowired
private patientrepository patientrepository;

//create
public patient addpatient(patient patient) {
	return patientrepository.save(patient);
}

//read
public List<patient>getAllpatients(){
	return patientrepository.findAll();	
}

//read by id
public Optional<patient>getpatientById(Long id){
	return patientrepository.findById(id);	
}

//update
public patient updatepatient(Long id,patient patient) {
	patient existingpatient=patientrepository.findById(id).orElseThrow(()->new RuntimeException("patient not found"));
	existingpatient.setName(patient.getName());
	existingpatient.setAge(patient.getAge());
	existingpatient.setDisease(patient.getDisease());

	return patientrepository.save(existingpatient);	
}

//delete
public String deletepatient(Long id) {
	patient existingpatient=patientrepository.findById(id).orElseThrow(()->new RuntimeException("patient not found"));
	patientrepository.delete(existingpatient);
	return "patient deleted successfully";	
}
}
