package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.CalculationService;

/**
 * 計算画面を制御するController
 * 
 * @author saki
 */
@Controller
public class CalcController {

	@Autowired
	CalculationService service;

	@RequestMapping("home")
	public String getHome() {

//	public String list(Model model) {
//
//		List<Formula> formulas = service.getFormulaList();
//
//		model.addAttribute("formulas", formulas); // thymeleafに渡す

		return "home";
	}

	@GetMapping("/register")
	public String getRegister() {
		return "register";
	}

}
