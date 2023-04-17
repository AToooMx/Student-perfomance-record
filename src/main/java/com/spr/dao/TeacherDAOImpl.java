package com.spr.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spr.api.Teacher;

@Repository
public class TeacherDAOImpl implements TeacherDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Teacher> getTeacherByName(String name) {

		String sql = "SELECT id, first_name as 'firstName', last_name as 'lastName', father_name as 'fatherName', date_of_birthday as 'dateOfBirthday', phone, email FROM Teachers WHERE first_name like ? or last_name like ? or father_name like ?";
		List<Teacher> teacherList = new ArrayList<Teacher>();
		Object[] args = { name, name, name };
		teacherList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Teacher>(Teacher.class), args);

		return teacherList;
	}

	@Override
	public List<Teacher> getAllTeacher() {

		String sql = "SELECT id, first_name as 'firstName', last_name as 'lastName', father_name as 'fatherName', date_of_birthday as 'dateOfBirthday', phone, email FROM Teachers";
		List<Teacher> teacherList = new ArrayList<Teacher>();
		teacherList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Teacher>(Teacher.class));

		return teacherList;
	}

	@Override
	public Teacher getTeacherById(int id) {

		String sql = "SELECT id, first_name as 'firstName', last_name as 'lastName', father_name as 'fatherName', date_of_birthday as 'dateOfBirthday', phone, email FROM Teachers WHERE id = ?";
		Teacher teacher = new Teacher();
		teacher = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Teacher>(Teacher.class), id);

		return teacher;
	}

	@Override
	public void updateTeacher(Teacher teacher) {

		String sql = "UPDATE teachers SET first_name = ?, last_name = ?, father_name = ?, date_of_birthday = ?, phone = ?, email = ? WHERE id = ? ";
		Object[] args = { teacher.getFirstName(), teacher.getLastName(), teacher.getFatherName(),
				teacher.getDateOfBirthday(), teacher.getPhone(), teacher.getEmail(), teacher.getId() };
		jdbcTemplate.update(sql, args);
	}

	@Override
	public void addTeacher(Teacher teacher) {
		String sql = "INSERT INTO Teachers (first_name, last_name, father_name, date_of_birthday, Phone, Email) VALUES (?, ?, ?, ?, ?, ?)";
		Object[] args = { teacher.getFirstName(), teacher.getLastName(), teacher.getFatherName(),
				teacher.getDateOfBirthday(), teacher.getPhone(), teacher.getEmail() };
		jdbcTemplate.update(sql, args);
	}

}
