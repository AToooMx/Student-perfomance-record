package com.spr.services;

import java.util.List;

import com.spr.api.Teacher;

public interface TeacherService {

	List<Teacher> getAllTeacher();
	
	List<Teacher> getTeacherByName(String name);
	
	Teacher getTeacherById(int id);
	
	void updateTeacher(Teacher teacher);
	
	void addTeacher(Teacher teacher);

}
