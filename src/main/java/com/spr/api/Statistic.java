package com.spr.api;

public class Statistic {
	private Integer allStudentCount;
	private Integer fullTimeStudentCount;
	private Integer externalStudentCount;
	private Integer teachersCount;
	private Integer facultyCount;
	private Integer specialtyCount;
	private Integer groupsCount;

	public Statistic() {

	}

	public Statistic(int allStudentCount, int fullTimeStudentCount, int externalStudentCount, int teachersCount,
			int facultyCount, int specialtyCount, int groupsCount) {
		this.allStudentCount = allStudentCount;
		this.fullTimeStudentCount = fullTimeStudentCount;
		this.externalStudentCount = externalStudentCount;
		this.teachersCount = teachersCount;
		this.facultyCount = facultyCount;
		this.specialtyCount = specialtyCount;
		this.groupsCount = groupsCount;
	}

	public int getAllStudentCount() {
		return allStudentCount;
	}

	public void setAllStudentCount(int allStudentCount) {
		this.allStudentCount = allStudentCount;
	}

	public int getFullTimeStudentCount() {
		return fullTimeStudentCount;
	}

	public void setFullTimeStudentCount(int fullTimeStudentCount) {
		this.fullTimeStudentCount = fullTimeStudentCount;
	}

	public int getExternalStudentCount() {
		return externalStudentCount;
	}

	public void setExternalStudentCount(int externalStudentCount) {
		this.externalStudentCount = externalStudentCount;
	}

	public int getTeachersCount() {
		return teachersCount;
	}

	public void setTeachersCount(int teachersCount) {
		this.teachersCount = teachersCount;
	}

	public int getFacultyCount() {
		return facultyCount;
	}

	public void setFacultyCount(int facultyCount) {
		this.facultyCount = facultyCount;
	}

	public int getSpecialtyCount() {
		return specialtyCount;
	}

	public void setSpecialtyCount(int specialtyCount) {
		this.specialtyCount = specialtyCount;
	}

	public int getGroupsCount() {
		return groupsCount;
	}

	public void setGroupsCount(int groupsCount) {
		this.groupsCount = groupsCount;
	}

}
