package com.spr.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spr.api.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> getStudentByGroupId(int id) {

		String sql = "SELECT id, first_name as 'firstName', last_name as 'lastName', father_name as 'fatherName', date_of_birthday as 'dateOfBirthday', phone, email FROM Students WHERE group_id = ?";

		List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class), id);

		return studentList;
	}

	@Override
	public List<Student> getStudentByName(String name) {

		String sql = "SELECT id, first_name as 'firstName', last_name as 'lastName', father_name as 'fatherName', date_of_birthday as 'dateOfBirthday', phone, email FROM Students WHERE first_name like ? or last_name like ? or father_name like ?";

		Object[] args = { name, name, name };

		List<Student> student = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class), args);
		System.out.println(student);
		return student;
	}

}
