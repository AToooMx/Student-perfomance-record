package com.spr.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spr.api.SubjectDTO;
import com.spr.api.Teacher;
import com.spr.services.SubjectService;
import com.spr.services.TeacherService;

@Controller
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	@Autowired
	private SubjectService subjectService;

	@RequestMapping("/teachers")
	public String showTeachersPage(Model model) {

		model.addAttribute("teachers", teacherService.getAllTeacher());

		return "teachers-page";
	}

	@RequestMapping("/teacherInfo")
	public String showTeacherInfoPage(@RequestParam("id") int id, Model model) {

		model.addAttribute("teacher", teacherService.getTeacherById(id));

		model.addAttribute("teacherSubjects", subjectService.getSubjectByTeacherId(id));

		model.addAttribute("subjects", subjectService.getAllSubject());

		model.addAttribute("subject", new SubjectDTO());

		return "teacher-info-page";
	}

	@PostMapping("/addSubjectForTeacher")
	public String addSubjectForTeacher(@ModelAttribute("subject") SubjectDTO subjectDTO) {

		subjectService.addSubjectForTeacher(subjectDTO);

		return "redirect:/teacherInfo?id=" + subjectDTO.getTeacherId();
	}

	@PostMapping("/removeSubjectFromTeacher")
	public String removeSubjectFromTeacher(@ModelAttribute("subject") SubjectDTO subjectDTO) {

		System.out.println(subjectDTO);
		subjectService.removeSubjectForTeacher(subjectDTO);

		return "redirect:/teacherInfo?id=" + subjectDTO.getTeacherId();
	}

	@GetMapping("/save-teacher")
	public String updateTeacherInfo(@Valid @ModelAttribute("teacher") Teacher teacher, BindingResult result) {

		if (result.hasErrors()) {
			System.out.println(result.toString());
			if (teacher.getId() == 0) {
				return "redirect:/addTeacher";
			} else {
				return "redirect:/teacherInfo?id=" + teacher.getId();
			}
		} else {

			if (teacher.getId() != 0) {
				teacherService.updateTeacher(teacher);
			} else {
				teacherService.addTeacher(teacher);
				return "redirect:/teachers";
			}
		}

		return "redirect:/teacherInfo?id=" + teacher.getId();
	}

	@RequestMapping("/addTeacher")
	public String showAddTeacherPage(@ModelAttribute("teacher") Teacher teacher) {

		return "add-teacher-page";
	}

	@InitBinder
	public void initBiner(WebDataBinder binder) {

		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "firstName", editor);
		binder.registerCustomEditor(String.class, "lastName", editor);
		binder.registerCustomEditor(String.class, "fatherName", editor);
		binder.registerCustomEditor(String.class, "email", editor);
		binder.registerCustomEditor(String.class, "phone", editor);

	}
}
