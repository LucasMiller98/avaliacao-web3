package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Payment;
import com.example.demo.model.Register;
import com.example.demo.repository.RegisterRepository;

@Controller
public class RegisterController {
	
	@Autowired
	public RegisterRepository repo;
	
	@PostMapping("/register")
	public String savedRegister(Register register, Model model, Payment payment) {
		model.addAttribute("name", register.getName());
		repo.save(register);
		return "tela3";
	}
	
	@GetMapping("/listRegisters")
	public String listRegisters(Model model) {
		model.addAttribute("list", repo.findAll());
		return "tela4";
	}
	
	@GetMapping("/removeRegister")
	public String deletedRegisterById(Integer registrationNumber) {
		repo.deleteById(registrationNumber);
		return "redirect:/listRegisters";
	}
	
	@GetMapping("/editRegister")
	public String editOneRegister(Integer registrationNumber, Model model) {
		Register register = repo.findById(registrationNumber).orElse(null);
		model.addAttribute("register", register);
		
		return "tela2";
	}
}
