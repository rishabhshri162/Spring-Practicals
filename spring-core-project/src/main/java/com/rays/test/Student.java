package com.rays.test;

public class Student {

	private String name;
	private String rollNo;
	private String phy;
	private String chm;
	private String math;

	public Student() {

	}

	public Student(String name, String rollNo, String phy, String chm, String math) {
		this.name = name;
		this.rollNo = rollNo;
		this.phy = phy;
		this.chm = chm;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getPhy() {
		return phy;
	}

	public void setPhy(String phy) {
		this.phy = phy;
	}

	public String getChm() {
		return chm;
	}

	public void setChm(String chm) {
		this.chm = chm;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

}
