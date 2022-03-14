package com.example.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Formula;
import com.example.demo.repository.DateFormulaRepository;

@Service
public class CalculationService {

	@Autowired
	DateFormulaRepository repository;

	/**
	 * 計算式を全件取得
	 */
	public List<Formula> getFormulaList() {
		return repository.selectAll();
	}

	/**
	 * 計算式を登録
	 */
	public void insert(Formula formula) {
		repository.insert(formula);
	}

	/**
	 * 日付計算処理
	 */
	public String calculate(String baseDate, Formula formula) {
		LocalDate date = LocalDate.parse(baseDate, DateTimeFormatter.ofPattern("yyyyMMdd"));
		LocalDate calculatedDate = date.plusYears(formula.getCalcYear()).plusMonths(formula.getCalcMonth())
				.plusDays(formula.getCalcDay());
		return calculatedDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	}
}
