package com.spr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spr.api.Statistic;

import rowmappers.CountRowMapper;

@Component
public class StatisticDAOImpl implements StatisticDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Statistic getStatistics() {

		Statistic statistic = new Statistic();

		String studentCount = "SELECT COUNT(*) as 'count' FROM Students";
		String teacherCount = "SELECT COUNT(*) as 'count' FROM Teachers";
		String fullTimeStudentCount = "SELECT COUNT(*) as 'count' FROM Students inner join groups on groups.id = students.group_id inner join studyform on studyform.id = groups.study_form_id WHERE studyform.id = 0";
		String externalStudentCount = "SELECT COUNT(*) as 'count' FROM Students inner join groups on groups.id = students.group_id inner join studyform on studyform.id = groups.study_form_id WHERE studyform.id = 1";
		String specialityCount = "SELECT COUNT(*) as 'count' FROM Specialty";
		String groupCount = "SELECT COUNT(*) as 'count' FROM Groups";
		String facultyCount = "SELECT COUNT(*) as 'count' FROM Faculty";

		statistic.setAllStudentCount(jdbcTemplate.queryForObject(studentCount, new CountRowMapper()));
		statistic.setTeachersCount(jdbcTemplate.queryForObject(teacherCount, new CountRowMapper()));
		statistic.setFullTimeStudentCount(jdbcTemplate.queryForObject(fullTimeStudentCount, new CountRowMapper()));
		statistic.setExternalStudentCount(jdbcTemplate.queryForObject(externalStudentCount, new CountRowMapper()));
		statistic.setSpecialtyCount(jdbcTemplate.queryForObject(specialityCount, new CountRowMapper()));
		statistic.setGroupsCount(jdbcTemplate.queryForObject(groupCount, new CountRowMapper()));
		statistic.setFacultyCount(jdbcTemplate.queryForObject(facultyCount, new CountRowMapper()));

		return statistic;
	}

}
