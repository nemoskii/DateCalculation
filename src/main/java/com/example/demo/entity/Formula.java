package com.example.demo.entity;

public class Formula {

	// 自動採番No
	private int id;
	// 日付ID
	private String dateId;
	// 日付名
	private String dateName;
	// 計算結果
	private String result;
	// 編集
	private String edit;

	public Formula(int id, String dateId, String dateName, String result) {
		this.id = id;
		this.dateId = dateId;
		this.dateName = dateName;
		this.result = result;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateId() {
		return dateId;
	}

	public void setDateId(String dateId) {
		this.dateId = dateId;
	}

	public String getDateName() {
		return dateName;
	}

	public void setDateName(String dateName) {
		this.dateName = dateName;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getEdit() {
		return edit;
	}

	public void setEdit(String edit) {
		this.edit = edit;
	}

}
