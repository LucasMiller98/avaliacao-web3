package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Register;

@Controller
public class MenuController {
	
	@GetMapping("/")
	public String handleMenuScreen() {
		return "tela1";
	}
	
	@GetMapping("/courseRegister")
	public String handlCourseRegister(Register register) {
		return "tela2";
	}
}
