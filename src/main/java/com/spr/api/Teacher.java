package com.spr.api;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Teacher {

	private int id;
	@NotBlank(message = "Поле не може бути пустим")
	private String firstName;
	@NotBlank(message = "Поле не може бути пустим")
	private String lastName;
	@NotBlank(message = "Поле не може бути пустим")
	private String fatherName;
	private String dateOfBirthday;
	private String phone;
	@NotBlank
	@Email(message = "Некоректний формат Email-адреси")
	private String email;

	public Teacher(int id, String firstName, String lastName, String fatherName, String dateOfBirthday, String phone,
			String email) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.dateOfBirthday = dateOfBirthday;
		this.phone = phone;
		this.email = email;
	}

	public Teacher() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirthday() {
		return dateOfBirthday;
	}

	public void setDateOfBirthday(String dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", fatherName="
				+ fatherName + ", dateOfBirthday=" + dateOfBirthday + ", phone=" + phone + ", email=" + email + "]";
	}

}
