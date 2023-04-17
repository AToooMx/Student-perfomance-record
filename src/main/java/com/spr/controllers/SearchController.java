package com.spr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spr.api.Group;
import com.spr.api.Student;
import com.spr.api.Teacher;
import com.spr.services.GroupService;
import com.spr.services.StudentService;
import com.spr.services.TeacherService;

@Controller
public class SearchController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private GroupService groupService;

	@RequestMapping("/search")
	public String showSearchPage(@RequestParam("search") String search, Model model) {

		List<Student> studentList = studentService.getStudentByName(search);
		model.addAttribute("students", studentList);

		List<Teacher> teacherList = teacherService.getTeacherByName(search);
		model.addAttribute("teachers", teacherList);

		List<Group> groupList = groupService.getGroupByParametrs(search);
		model.addAttribute("groups", groupList);

		return "search-page";
	}

}
