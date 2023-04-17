package com.spr.api;

public class SubjectDTO {
	private int id;
	private int subjectId;
	private int teacherId;
	private String name;

	public SubjectDTO(int id, int subjectId, int teacherId, String name) {
		this.id = id;
		this.subjectId = subjectId;
		this.teacherId = teacherId;
		this.name = name;
	}

	public SubjectDTO() {

	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "SubjectDTO [id=" + id + ", subjectId=" + subjectId + ", teacherId=" + teacherId + ", name=" + name
				+ "]";
	}

	
}
