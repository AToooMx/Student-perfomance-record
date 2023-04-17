package com.spr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spr.api.Student;
import com.spr.dao.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	@Override
	public List<Student> getStudentByGroupId(int id) {

		return studentDAO.getStudentByGroupId(id);
	}

	@Override
	public List<Student> getStudentByName(String name) {

		name = "%" + name + "%";

		return studentDAO.getStudentByName(name);
	}

}
