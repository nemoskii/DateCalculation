package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Formula;
import com.example.demo.mapper.CalcMapper;

@Service
public class CalcService {

	@Autowired
	CalcMapper mapper;

	/**
	 * 計算式を全件取得
	 */
	public List<Formula> getFormulaList() {

		return mapper.selectAll();
	}

}
