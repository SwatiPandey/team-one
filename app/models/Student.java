package models;

public class Student {
	private String name;
	private int rollNum;
	
	public Student(String name, int rollNum) {
		this.name = name;
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	

}
