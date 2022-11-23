package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.CreateAccount;
import com.example.demo.repository.CreateAccountRepository;

@Controller
public class CreateAccountController {
	
	@Autowired
	public CreateAccountRepository repo;
	
	@GetMapping("/createAccount")
	public String handleCreateAccountScreen() {
		return "createAccount/index";
	}
	
	@PostMapping("/create")
	public String handleCreateAccount(Model model, CreateAccount create) {
		
		if(!create.getPassword().equals(create.getConfirmPassword())) {		
			return "redirect:/createAccount";
		}
		
		repo.save(create);	
		return "login/index";			
	}
}
