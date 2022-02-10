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

	@RequestMapping("/list")
	public String list(Model model) {
		List<Formula> index = new ArrayList<Formula>();

		Formula oneYearAfter = new Formula(1, "010000", "１年後", "");
		Formula oneYearBefore = new Formula(2, "010000", "１年前", "");

		index.add(oneYearAfter);
		index.add(oneYearBefore);

		model.addAttribute("index", index);

		return "list";
	}
}
