package com.spr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {


	@RequestMapping("/studentInfo")
	public String showStudentPage(@RequestParam("id") int id, Model model) {
		
		//Student student = manager.getStudentById(id);
		//model.addAttribute("student", student);

		return "student-info-page";
	}

}
