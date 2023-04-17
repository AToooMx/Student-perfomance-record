package com.spr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spr.services.GroupService;
import com.spr.services.StudentService;

@Controller
public class GroupController {
	@Autowired
	private GroupService groupService;

	@Autowired
	private StudentService studentService;

	@RequestMapping("/groups")
	public String showGroupsPage(Model model) {

		model.addAttribute("groups", groupService.getAllGroups());

		return "groups-page";
	}

	@RequestMapping("/groupInfo")
	public String showGroupInfoPage(@RequestParam("id") int id, Model model) {
		model.addAttribute("students", studentService.getStudentByGroupId(id));
		model.addAttribute("group", groupService.getGroupById(id));

		return "group-info-page";
	}

}
