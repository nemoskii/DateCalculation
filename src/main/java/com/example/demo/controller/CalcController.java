package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Formula;

/**
 * 計算画面を制御するController
 * 
 * @author saki
 */
@Controller
public class CalcController {

	@RequestMapping("/simulation")
	public String list(Model model) {

		List<Formula> formulas = new ArrayList<Formula>();

		Formula oneYearLater = new Formula("1年後", 1, 0, 0);
		Formula twoMonthsLater = new Formula("2ヶ月後", 0, 2, 0);
		Formula fifteenDaysLater = new Formula("15日後", 0, 0, 15);

		formulas.add(fifteenDaysLater);
		formulas.add(twoMonthsLater);
		formulas.add(oneYearLater);

		model.addAttribute("formulas", formulas); // thymeleafに渡す

		return "simulation";
	}
}
