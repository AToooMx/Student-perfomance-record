package com.spr.dao;

import java.util.List;

import com.spr.api.Teacher;

public interface TeacherDAO {
	
	List<Teacher> getAllTeacher();

	List<Teacher> getTeacherByName(String name);
	
	Teacher getTeacherById(int id);
	
	void updateTeacher(Teacher teacher);

	void addTeacher(Teacher teacher);

}
