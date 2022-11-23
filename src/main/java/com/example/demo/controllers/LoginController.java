package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.CreateAccount;
import com.example.demo.repository.CreateAccountRepository;

@Controller
public class LoginController {
	
	@Autowired
	public CreateAccountRepository repo;
	
	@GetMapping("/")
	public String handleLoginScreen(Model model, CreateAccount create) {
		return "login/index";
	}
	
	@PostMapping("/logar")
	public String handleLogin(Model model, CreateAccount createAccount) {
		CreateAccount createAcc = this.repo.Login(createAccount.getEmail(), createAccount.getPassword());
		
		if(createAcc != null) {
			return "redirect:/menu";
		}
		
		model.addAttribute("error", "Usuário e/ou senha inválida.");
		
		return "login/index";
	}
}
