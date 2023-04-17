package com.spr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spr.api.Subject;
import com.spr.services.SubjectService;

@Controller
public class SubjectController {
	@Autowired
	private SubjectService subjectService;

	@RequestMapping("/subjects")
	public String showSubjectsPage(Model model) {

		List<Subject> subjectList = subjectService.getAllSubject();

		int halfListSize = (subjectList.size() % 2 == 0 ? (subjectList.size() / 2) : (subjectList.size() / 2 + 1));

		model.addAttribute("subjectsOne", subjectList.subList(0, halfListSize));
		model.addAttribute("subjectsTwo", subjectList.subList(halfListSize, subjectList.size()));
		model.addAttribute("subject", new Subject());

		return "subjects-page";
	}

	@PostMapping("/addSubject")
	public String addSubjects(@ModelAttribute("subject") Subject subject) {

		if (subject.getName() != null)
			subjectService.addSubject(subject);

		return "redirect:/subjects";
	}

	@RequestMapping("/removeSubject")
	public String removeSubject(@RequestParam("id") int id) {

		subjectService.removeSubjectById(id);

		return "redirect:/subjects";
	}

	@InitBinder
	public void initBiner(WebDataBinder binder) {

		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "name", editor);

	}
}
