package com.spr.api;

public class Specialty {
	private int id;
	private String specialtyName;
	private String specialtyUkrName;
	private Faculty faculty;

	public Specialty(int id, String specialtyName, String specialtyUkrName) {
		this.id = id;
		this.specialtyName = specialtyName;
		this.specialtyUkrName = specialtyUkrName;
	}

	public Specialty(int id, String specialtyName, String specialtyUkrName, Faculty faculty) {
		super();
		this.id = id;
		this.specialtyName = specialtyName;
		this.specialtyUkrName = specialtyUkrName;
		this.faculty = faculty;
	}

	public Specialty() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecialtyName() {
		return specialtyName;
	}

	public void setSpecialtyName(String specialtyName) {
		this.specialtyName = specialtyName;
	}

	public String getSpecialtyUkrName() {
		return specialtyUkrName;
	}

	public void setSpecialtyUkrName(String specialtyUkrName) {
		this.specialtyUkrName = specialtyUkrName;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "SpecialtyInfo [id=" + id + ", specialtyName=" + specialtyName + ", specialtyUkrName=" + specialtyUkrName
				+ ", faculty=" + faculty + "]";
	}

}
