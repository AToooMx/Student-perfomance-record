package com.spr.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spr.api.Subject;
import com.spr.api.SubjectDTO;

@Service
public class SubjectTeacherDAOImpl implements SubjectTeacherDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Subject> getSubjectByTeacherId(int id) {

		String sql = "SELECT SubjectTeacher.id, Subject.name FROM Subject inner join SubjectTeacher on Subject.id = SubjectTeacher.subject_id WHERE SubjectTeacher.teacher_id = ?";

		List<Subject> subjectList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Subject>(Subject.class), id);

		return subjectList;
	}

	@Override
	public void addSubjectForTeacher(SubjectDTO subjectDTO) {

		String sql = "INSERT INTO subjectteacher (subject_id, teacher_id) VALUES (?, ?)";
		Object[] args = { subjectDTO.getSubjectId(), subjectDTO.getTeacherId() };
		jdbcTemplate.update(sql, args);

	}

	@Override
	public void removeSubjectForTeacher(SubjectDTO subjectDTO) {

		String sql = "DELETE FROM subjectteacher WHERE id = ?";
		Object arg = subjectDTO.getId();
		jdbcTemplate.update(sql, arg);
	}

	@Override
	public List<Subject> getSubjectByTeacherAndSubjectId(int teacherId, int subjectId) {

		String sql = "SELECT id FROM SubjectTeacher WHERE teacher_id = ? and subject_id = ?";

		List<Subject> subjectList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Subject>(Subject.class),
				teacherId, subjectId);

		return subjectList;
	}

}
