package com.example.demo.domain;

import java.util.List;

public class SimulationForm {

	// 計算基準日
	private String baseDate;

	// 計算結果
	private List<Result> result;

	public String getBaseDate() {
		return baseDate;
	}

	public void setBaseDate(String baseDate) {
		this.baseDate = baseDate;
	}

	public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}

}
