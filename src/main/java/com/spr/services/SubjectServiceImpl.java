package com.spr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spr.api.Subject;
import com.spr.api.SubjectDTO;
import com.spr.dao.SubjectDAO;
import com.spr.dao.SubjectTeacherDAO;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectDAO subjectDAO;
	@Autowired
	private SubjectTeacherDAO subjectTeacherDAO;

	@Override
	public List<Subject> getAllSubject() {

		return subjectDAO.getAllSubject();
	}

	@Override
	public void removeSubjectById(int id) {

		subjectDAO.removeSubjectById(id);
	}

	@Override
	public void addSubject(Subject subject) {

		subjectDAO.addSubject(subject);
	}

	@Override
	public void addSubjectForTeacher(SubjectDTO subjectDTO) {

		if (!isRecordAlreadyExists(subjectDTO.getTeacherId(), subjectDTO.getSubjectId())) {
			subjectTeacherDAO.addSubjectForTeacher(subjectDTO);
		}
	}

	@Override
	public List<Subject> getSubjectByTeacherId(int id) {

		return subjectTeacherDAO.getSubjectByTeacherId(id);
	}

	@Override
	public void removeSubjectForTeacher(SubjectDTO subjectDTO) {

		subjectTeacherDAO.removeSubjectForTeacher(subjectDTO);

	}

	private boolean isRecordAlreadyExists(int teacherId, int subjectId) {

		return subjectTeacherDAO.getSubjectByTeacherAndSubjectId(teacherId, subjectId).size() > 0 ? true : false;
	}

}
