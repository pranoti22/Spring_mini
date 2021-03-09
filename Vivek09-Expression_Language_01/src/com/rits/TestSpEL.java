package com.rits;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rits.Shape;


public class TestSpEL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-SpEL.config.xml");
		Shape shape = ctx.getBean(Circle.class);
		System.out.println("Area "+shape.getArea());

	}

}
