package com.dgit.ex3;

import java.util.ArrayList;

public class MyInfo {
	private String name;
	private double weight;
	private double height;
	private ArrayList<String> hobbys;
	private BMICalculator bimCalculator;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public ArrayList<String> getHobbys() {
		return hobbys;
	}
	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	public BMICalculator getBimCalculator() {
		return bimCalculator;
	}
	public void setBimCalculator(BMICalculator bimCalculator) {
		this.bimCalculator = bimCalculator;
	}
	
	public void printInfo(){
		System.out.println("이름: "+name);
		System.out.println("몸무게: "+weight);
		System.out.println("키: "+height);
		System.out.println("취미: "+hobbys);
		bimCalculator.bimClaculator(weight, height);
	}
}
