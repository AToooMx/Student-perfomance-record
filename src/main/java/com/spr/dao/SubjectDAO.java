package com.spr.dao;

import java.util.List;

import com.spr.api.Subject;
import com.spr.api.SubjectDTO;

public interface SubjectDAO {

	List<Subject> getAllSubject();

	void removeSubjectById(int id);

	void addSubject(Subject subject);

}
