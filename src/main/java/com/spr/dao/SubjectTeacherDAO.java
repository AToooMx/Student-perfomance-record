package com.spr.dao;

import java.util.List;

import com.spr.api.Subject;
import com.spr.api.SubjectDTO;

public interface SubjectTeacherDAO {
	
	void addSubjectForTeacher(SubjectDTO subjectDTO);

	void removeSubjectForTeacher(SubjectDTO subjectDTO);

	List<Subject> getSubjectByTeacherId(int id);
	
	List<Subject> getSubjectByTeacherAndSubjectId(int teacherId, int subjectId);
}
