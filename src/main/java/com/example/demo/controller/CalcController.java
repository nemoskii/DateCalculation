package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Formula;
import com.example.demo.service.CalcService;

/**
 * 計算画面を制御するController
 * 
 * @author saki
 */
@Controller
public class CalcController {

	@Autowired
	CalcService service;

	@RequestMapping("/simulation")
	public String list(Model model) {
		List<Formula> index = service.getFormulaList();
//
//		Formula oneYearAfter = new Formula("１年後", 1, 0, 0);
//		Formula oneMonthAfter = new Formula("１月後", 0, 1, 0);
//
//		index.add(oneYearAfter);
//		index.add(oneMonthAfter);

		model.addAttribute("index", index);

		return "simulation";
	}
}
