package com.example.demo.domain;

public class Result {

	// 計算式
	private Formula formula;

	// 計算結果
	private String calculated;

	public Formula getFormula() {
		return formula;
	}

	public void setFormula(Formula formula) {
		this.formula = formula;
	}

	public String getCalculated() {
		return calculated;
	}

	public void setCalculated(String calculated) {
		this.calculated = calculated;
	}

}
