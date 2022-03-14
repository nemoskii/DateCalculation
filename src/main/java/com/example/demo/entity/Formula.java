package com.example.demo.entity;

public class Formula {
	// 日付名
	private String dateName;
	// 加減値（年）
	private int calcYear;
	// 加減値（月）
	private int calcMonth;
	// 加減値（日）
	private int calcDay;

	public Formula(String dateName, int calcYear, int calcMonth, int calcDay) {
		this.dateName = dateName;
		this.calcYear = calcYear;
		this.calcYear = calcMonth;
		this.calcYear = calcDay;
	}

	public String getDateName() {
		return dateName;
	}

	public void setDateName(String dateName) {
		this.dateName = dateName;
	}

	public int getFormulaYear() {
		return calcYear;
	}

	public void setFormulaYear(int formulaYear) {
		this.calcYear = formulaYear;
	}

	public int getFormulaMonth() {
		return calcMonth;
	}

	public void setFormulaMonth(int formulaMonth) {
		this.calcMonth = formulaMonth;
	}

	public int getFormulaDay() {
		return calcDay;
	}

	public void setFormulaDay(int formulaDay) {
		this.calcDay = formulaDay;
	}

}
