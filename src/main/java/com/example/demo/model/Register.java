package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Inscricao")
public class Register {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero_de_inscricao")
	private Integer registrationNumber;
	
	@Column(name = "nome")
	private String name;
	
	@Transient
	private Integer age;
	
	private String email;
	
	@Column(name = "nivel_de_conhecimento_JS")
	@Enumerated(EnumType.STRING)
	private LevelKnowledgeJS levelKnowledgeJS;
	
	@Column(name = "e_estudante_do_IFPE")
	private Boolean isIFPEStudent;
	
	@Column(name = "matricula")
	private Integer enrollment;
	
	@Column(name = "turno")
	@Enumerated(EnumType.STRING)
	private Shift shift;
	
	@Column(name = "pagamento")
	@Enumerated(EnumType.STRING)
	private Payment payment;
	
	public Register() {
		
	}

	public Register(Integer registrationNumber, String name, Integer age, String email,
			LevelKnowledgeJS levelKnowledgeJS, Boolean isIFPEStudent, Integer enrollment, Shift shift,
			Payment payment) {
		super();
		this.registrationNumber = registrationNumber;
		this.name = name;
		this.age = age;
		this.email = email;
		this.levelKnowledgeJS = levelKnowledgeJS;
		this.isIFPEStudent = isIFPEStudent;
		this.enrollment = enrollment;
		this.shift = shift;
		this.payment = payment;
	}

	public Integer getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(Integer registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LevelKnowledgeJS getLevelKnowledgeJS() {
		return levelKnowledgeJS;
	}

	public void setLevelKnowledgeJS(LevelKnowledgeJS levelKnowledgeJS) {
		this.levelKnowledgeJS = levelKnowledgeJS;
	}

	public Boolean getIsIFPEStudent() {
		return isIFPEStudent;
	}

	public void setIsIFPEStudent(Boolean isIFPEStudent) {
		this.isIFPEStudent = isIFPEStudent;
	}

	public Integer getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(Integer enrollment) {
		this.enrollment = enrollment;
	}

	public Shift getShift() {
		return shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
}
