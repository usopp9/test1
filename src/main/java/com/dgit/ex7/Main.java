package com.dgit.ex7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dgit.ex4.StudentInfo;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		StudentInfo s1 = ctx.getBean("student1",StudentInfo.class);
		s1.getInfo();
		System.out.println("======================================");
		StudentInfo s2 = ctx.getBean("student2",StudentInfo.class);
		s2.getInfo();
		
		ctx.close();
	}

}
