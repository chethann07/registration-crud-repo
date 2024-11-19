package com.example.registration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.registration.model.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
