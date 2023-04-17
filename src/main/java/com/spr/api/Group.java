package com.spr.api;

public class Group {
	private int id;
	private String groupName;
	private int course;
	private String formName;
	private String programmName;
	private Specialty specialty;

	public Group(int id, String groupName, int course, String formName, String programmName) {
		this.id = id;
		this.groupName = groupName;
		this.course = course;
		this.formName = formName;
		this.programmName = programmName;
	}

	public Group(int id, String groupName, int course, String formName, String programmName,
			Specialty specialty) {
		this.id = id;
		this.groupName = groupName;
		this.course = course;
		this.formName = formName;
		this.programmName = programmName;
		this.specialty = specialty;
	}

	public Group() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	@Override
	public String toString() {
		return "GroupInfo [id=" + id + ", groupName=" + groupName + ", course=" + course + ", formName=" + formName
				+ ", specialty=" + specialty + "]";
	}

	public String getProgrammName() {
		return programmName;
	}

	public void setProgrammName(String programmName) {
		this.programmName = programmName;
	}

}
