package com.rits;
public class Circle implements Shape {
	float area;
	float radius = 11.5f;
	float circumference;
	String shape;
	Circle(float radius){
		this.radius = radius;
	}

	public void setRadius(float radius) {
		System.out.println("Set radius called "+radius);
		this.radius = radius;
	}
	public float getRadius() {
		System.out.println("get raius called "+radius);
		return radius;
	}
	public float getCircumference() {
		
		return circumference;
	}

	public void setCircumference(float circumference) {
		this.circumference = circumference;
	}

	public void setArea(float area) {
		System.out.println("Set area called "+area);
		this.area = area;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public float getArea() {
		
		return area;
	}

	@Override
	public float getPerimiter() {
		// TODO Auto-generated method stub
		return circumference;
	}

	@Override
	public String getShape() {
		return shape;
	}

}
