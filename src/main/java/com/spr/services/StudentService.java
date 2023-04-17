package com.spr.services;

import java.util.List;

import com.spr.api.Student;

public interface StudentService {
	
	List<Student> getStudentByGroupId(int id);
	
	List<Student> getStudentByName(String name);
	
}
