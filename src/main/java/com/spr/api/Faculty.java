package com.spr.api;

public class Faculty {
	private int id;
	private String facultyName;

	public Faculty() {

	}

	public Faculty(int id, String facultyName) {
		this.id = id;
		this.facultyName = facultyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	@Override
	public String toString() {
		return "FacultyInfo [id=" + id + ", facultyName=" + facultyName + "]";
	}

}
