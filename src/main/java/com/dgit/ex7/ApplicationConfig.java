package com.dgit.ex7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dgit.ex4.Report;
import com.dgit.ex4.StudentInfo;
import com.dgit.ex6.Family;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Family family1(){
		Family family = new Family("매미 아빠", "매미 엄마");
		family.setSister("매미 동생");
		return family;
	}
	
	@Bean
	public Report report1(){
		Report report = new Report();
		report.setGrade1(91);
		report.setGrade2(81);
		report.setGrade3(71);
		report.setGrade4(61);
		return report;
	}
	@Bean
	public StudentInfo student1(){
		StudentInfo s = new StudentInfo(report1(),family1());
		s.setName("매미");
		s.setStdclass("2학년");
		s.setEng(99);
		s.setKor(85);
		s.setMath(56);
		return s;		
	}
	@Bean
	public StudentInfo student2(){
		StudentInfo s = new StudentInfo();
		s.setReport(report1());
		s.setName("홍구");
		s.setStdclass("3학년");
		s.setEng(88);
		s.setKor(68);
		s.setMath(94);
		return s;	
	}
}
