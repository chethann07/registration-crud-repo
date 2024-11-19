package com.example.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.registration.model.Registration;
import com.example.registration.service.RegistrationService;

@Controller
public class RegistrationController {
	
	@Autowired
	private RegistrationService registerService;
	
	@GetMapping({"/", "/getAllUsers"})
	public String getAllUsers(Model model) {
		List<Registration> userList = registerService.getAllUsers();
		model.addAttribute("users", userList);
		return "GetAllUsers";
	}
	
	@GetMapping("/addUser")
	public String addNewUser(Model model) {
		model.addAttribute("user", new Registration());
		return "Register";
	}
	
	@PostMapping("/saveUser")
	public String saveUser(Registration registration) {
		registerService.addOrSaveUser(registration);
		return "redirect:/getAllUsers";
	}
	
	@GetMapping("/updateUser/{registrationId}")
	public String updateUser(Model model, @PathVariable int registrationId) {
		model.addAttribute("user", registerService.findUser(registrationId));
		return "Register";
	}
	
	@GetMapping("/deleteUser/{registrationId}")
	public String deleteUser(@PathVariable int registrationId) {
	    registerService.deleteUser(registrationId);
	    return "redirect:/getAllUsers";
	}
}
