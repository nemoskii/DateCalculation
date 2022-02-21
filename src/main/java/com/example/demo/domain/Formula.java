package com.example.demo.domain;

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
		this.calcMonth = calcMonth;
		this.calcDay = calcDay;
	}

	public String getDateName() {
		return dateName;
	}

	public void setDateName(String dateName) {
		this.dateName = dateName;
	}

	public int getCalcYear() {
		return calcYear;
	}

	public void setCalcYear(int calcYear) {
		this.calcYear = calcYear;
	}

	public int getCalcMonth() {
		return calcMonth;
	}

	public void setCalcMonth(int calcMonth) {
		this.calcMonth = calcMonth;
	}

	public int getCalcDay() {
		return calcDay;
	}

	public void setCalcDay(int calcDay) {
		this.calcDay = calcDay;
	}

}
