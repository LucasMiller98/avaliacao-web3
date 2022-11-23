package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conta")
public class CreateAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codeId;
	private String email;
	private String password;
	private String confirmPassword;
	
	public CreateAccount() {
		
	}
	
	public CreateAccount(Integer codeId, String email, String password, String confirmPassword) {
		this.codeId = codeId;
		this.confirmPassword = confirmPassword;
		this.email = email;
		this.password = password;
	}
	
	public Integer getCodeId() {
		return codeId;
	}
	
	public void setCodeId(Integer codeId) {
		this.codeId = codeId;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirmPassword() {
		return confirmPassword;
	}
	
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
