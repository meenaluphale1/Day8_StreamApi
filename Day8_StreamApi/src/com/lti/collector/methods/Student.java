package com.lti.collector.methods;

public class Student {

	int stuId;
	String stuName;
	int score;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(int stuId, String stuName, int score) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.score = score;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", score=" + score + "]";
	}
	
}
