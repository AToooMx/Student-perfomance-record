package com.spr.services;

import java.util.List;

import com.spr.api.Subject;
import com.spr.api.SubjectDTO;

public interface SubjectService {
	
	List<Subject> getAllSubject();

	void removeSubjectById(int id);

	void addSubject(Subject subject);
	
	List<Subject> getSubjectByTeacherId(int id);

	void addSubjectForTeacher(SubjectDTO subjectDTO);

	void removeSubjectForTeacher(SubjectDTO subjectDTO);
}
