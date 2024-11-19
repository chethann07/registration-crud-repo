package com.example.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.registration.model.Registration;
import com.example.registration.repo.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registerRepo;
	
//	CREATE AND UPDATE
	public boolean addOrSaveUser(Registration registeration) {
		Registration registerObj = registerRepo.save(registeration);
		if(registerRepo.findById(registerObj.getRegistrationId()) != null) {
			return true;
		}
		return false;
	}
	
//	READ
	public List<Registration> getAllUsers() {
		List<Registration> userList = registerRepo.findAll();
		return userList;
	}

//	DELETE
	public boolean deleteUser(int registrationId) {
		registerRepo.deleteById(registrationId);
		if(registerRepo.findById(registrationId).isEmpty()) {
			return true;
		}
		return false;
	}
	
	public Registration findUser(int registrationId) {
		Registration user = registerRepo.findById(registrationId).get();
		return user;
	}
}
