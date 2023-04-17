package com.spr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spr.api.Teacher;
import com.spr.dao.TeacherDAO;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherDAO teacherDAO;

	@Override
	public List<Teacher> getTeacherByName(String name) {

		name = "%" + name + "%";

		return teacherDAO.getTeacherByName(name);
	}

	@Override
	public List<Teacher> getAllTeacher() {

		return teacherDAO.getAllTeacher();
	}

	@Override
	public Teacher getTeacherById(int id) {

		return teacherDAO.getTeacherById(id);
	}

	@Override
	public void updateTeacher(Teacher teacher) {

		if (teacher.getDateOfBirthday().isEmpty()) {
			teacher.setDateOfBirthday(null);
		}

		if (teacher.getEmail().isEmpty()) {
			teacher.setEmail(null);
		}

		teacherDAO.updateTeacher(teacher);

	}

	@Override
	public void addTeacher(Teacher teacher) {
		if (teacher.getDateOfBirthday().isEmpty()) {
			teacher.setDateOfBirthday(null);
		}

		if (teacher.getEmail().isEmpty()) {
			teacher.setEmail(null);
		}

		teacherDAO.addTeacher(teacher);
	}

}
