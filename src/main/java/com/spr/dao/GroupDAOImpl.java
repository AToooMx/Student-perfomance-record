package com.spr.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spr.api.Group;

import rowmappers.GroupSpecialtyFacultyRowMapper;

@Repository
public class GroupDAOImpl implements GroupDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Group> getAllGroups() {

		String sql = "SELECT groups.id, groups.group_name, groups.course, specialty.id, specialty.specialty_name, specialty.ukraine_specialty_name, faculty.id, faculty.faculty_name, studyform.form_name, studyprogramm.name FROM groups inner join Specialty on groups.specialty_id = specialty.id inner join faculty on specialty.id_faculty = faculty.id inner join studyform on studyform.id = groups.study_form_id inner join studyprogramm on studyprogramm.id = groups.programm_id WHERE isEndLearning = false order by group_name, course";

		List<Group> groupList = new ArrayList<Group>();

		groupList = jdbcTemplate.query(sql, new GroupSpecialtyFacultyRowMapper());

		return groupList;
	}

	@Override
	public Group getGroupById(int id) {

		String sql = "SELECT groups.id, groups.group_name, groups.course, specialty.id, specialty.specialty_name, specialty.ukraine_specialty_name, faculty.id, faculty.faculty_name, studyform.form_name, studyprogramm.name FROM groups inner join Specialty on groups.specialty_id = specialty.id inner join faculty on specialty.id_faculty = faculty.id inner join studyform on studyform.id = groups.study_form_id inner join studyprogramm on studyprogramm.id = groups.programm_id WHERE groups.id = ? order by group_name, course";

		Group group = new Group();

		group = jdbcTemplate.queryForObject(sql, new GroupSpecialtyFacultyRowMapper(), id);

		return group;
	}

	@Override
	public List<Group> getGroupByParametrs(String para) {

		String sql = "SELECT groups.id, groups.group_name, groups.course, specialty.id, specialty.specialty_name, specialty.ukraine_specialty_name, faculty.id, faculty.faculty_name, studyform.form_name, studyprogramm.name FROM groups inner join Specialty on groups.specialty_id = specialty.id inner join faculty on specialty.id_faculty = faculty.id inner join studyform on studyform.id = groups.study_form_id inner join studyprogramm on studyprogramm.id = groups.programm_id WHERE specialty.id like ? or groups.group_name like ? or specialty.ukraine_specialty_name like ?";

		List<Group> groupList = new ArrayList<Group>();

		Object[] args = { para, para, para };

		groupList = jdbcTemplate.query(sql, new GroupSpecialtyFacultyRowMapper(), args);

		return groupList;
	}

}
