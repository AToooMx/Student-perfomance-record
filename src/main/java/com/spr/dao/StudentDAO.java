package com.spr.dao;

import java.util.List;

import com.spr.api.Student;

public interface StudentDAO {

	List<Student> getStudentByGroupId(int id);
	
	List<Student> getStudentByName(String name);

}
