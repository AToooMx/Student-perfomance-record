package com.spr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spr.api.Loggs;
import com.spr.api.Statistic;
import com.spr.services.LoggService;
import com.spr.services.StatisticService;

@Controller
public class SrpController {

	@Autowired
	private StatisticService statisticService;

	@Autowired
	private LoggService loggsService;

	@GetMapping("/")
	public String showPage() {

		return "redirect:homePage";
	}

	@RequestMapping("/homePage")
	public String showHomePage(Model model) {

		Statistic statistic = statisticService.getStatistics();
		List<Loggs> loggsList = loggsService.getLoggs();
		model.addAttribute("statistic", statistic);
		model.addAttribute("loggs", loggsList);

		return "home-page";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "login", editor);
	}

}
