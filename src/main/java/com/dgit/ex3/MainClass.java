package com.dgit.ex3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCtx3.xml");
		MyInfo m = ctx.getBean(MyInfo.class);
		m.printInfo();
		ctx.close();

	}

}
