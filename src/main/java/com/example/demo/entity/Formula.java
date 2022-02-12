package com.example.demo.entity;

public class Formula {
	// 日付名
	private String dateName;
	// 加減値（年）
	private int formulaYear;
	// 加減値（月）
	private int formulaMonth;
	// 加減値（日）
	private int formulaDay;

	public Formula(String dateName, int formulaYear, int formulaMonth, int formulaDay) {
		this.dateName = dateName;
		this.formulaYear = formulaYear;
		this.formulaYear = formulaMonth;
		this.formulaYear = formulaDay;
	}

	public String getDateName() {
		return dateName;
	}

	public void setDateName(String dateName) {
		this.dateName = dateName;
	}

	public int getFormulaYear() {
		return formulaYear;
	}

	public void setFormulaYear(int formulaYear) {
		this.formulaYear = formulaYear;
	}

	public int getFormulaMonth() {
		return formulaMonth;
	}

	public void setFormulaMonth(int formulaMonth) {
		this.formulaMonth = formulaMonth;
	}

	public int getFormulaDay() {
		return formulaDay;
	}

	public void setFormulaDay(int formulaDay) {
		this.formulaDay = formulaDay;
	}

}
