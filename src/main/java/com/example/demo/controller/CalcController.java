package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Formula;

/**
 * 計算画面を制御するController
 * 
 * @author saki
 */
@Controller
public class CalcController {

	@RequestMapping("/register")
	public String list(Model model) {
		List<Formula> index = new ArrayList<Formula>();

		Formula oneYearAfter = new Formula("１年後", 1, 0, 0);
		Formula oneMonthAfter = new Formula("１月後", 0, 1, 0);

		index.add(oneYearAfter);
		index.add(oneMonthAfter);

		model.addAttribute("index", index);

		return "register";
	}
}
