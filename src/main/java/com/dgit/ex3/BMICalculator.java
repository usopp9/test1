package com.dgit.ex3;

public class BMICalculator {
	private double normal;
	private double overWeight;
	private double lowWeight;
	private double obesity;
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getOverWeight() {
		return overWeight;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public double getLowWeight() {
		return lowWeight;
	}
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public double getObesity() {
		return obesity;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	public void bimClaculator(double weight, double height){
		double h = height * 0.01;
		double result = weight / (h * h);
		System.out.println("BMI 지수:" + result);
		
		if(result > obesity){
			System.out.println("비만입니다.");
		}else if(result > overWeight){
			System.out.println("과체중입니다.");
		}else if(result > normal){
			System.out.println("정상입니다.");
		}else{
			System.out.println("저체중입니다.");
		}
	}
}
