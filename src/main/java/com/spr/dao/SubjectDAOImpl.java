package com.spr.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spr.api.Subject;
import com.spr.api.SubjectDTO;

@Repository
public class SubjectDAOImpl implements SubjectDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Subject> getAllSubject() {

		String sql = "SELECT * FROM Subject order by name";

		List<Subject> subjectList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Subject>(Subject.class));

		return subjectList;
	}

	@Override
	public void removeSubjectById(int id) {

		String sql = "DELETE FROM Subject WHERE id = ?";

		jdbcTemplate.update(sql, id);

	}

	@Override
	public void addSubject(Subject subject) {

		String sql = "INSERT INTO Subject (name) VALUES (?)";

		jdbcTemplate.update(sql, subject.getName());

	}


}
