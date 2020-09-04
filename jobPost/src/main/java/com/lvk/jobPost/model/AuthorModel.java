package com.lvk.jobPost.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AuthorModel {

	@Id
	private String email;
	private String name;
	private String phoneNumber;
	private String company;
	private String position;
	@Column(name="aboutCompany", columnDefinition="TEXT")
	private String aboutCompany;

	public AuthorModel() {

	}

	public AuthorModel(String email, String name, String phoneNumber, String company, String position,
			String aboutCompany) {
		super();
		this.email = email;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.company = company;
		this.position = position;
		this.aboutCompany = aboutCompany;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAboutCompany() {
		return aboutCompany;
	}

	public void setAboutCompany(String aboutCompany) {
		this.aboutCompany = aboutCompany;
	}

}
