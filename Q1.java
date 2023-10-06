package com.main;

//import java.awt.geom.Area;

interface Shape{
	void getArea();
	void getPerimeter();
}
class Circle implements Shape{
	double radius;
	
	
	public Circle(double radius) {
		
		this.radius = radius;
	}

	@Override
	public void getArea() {
		System.out.println("Area of circle is : "+(3.14*radius*radius) );
		
	}

	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of circle is : "+(2*3.14*radius));
	}

	
	
}
class Rectangle implements Shape{
	double length;
	double width;
	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public void getArea() {
		System.out.println("Area of rectangle is : "+(length*width));
		
	}

	@Override
	public void getPerimeter() {
		System.out.println("Perimeter of rectangle is : "+(2*(length+width)) );
		
	}
	
}
public class Q1 {
	public static void main(String[] args) {
		Circle c1=new Circle(52);
		c1.getArea();
		c1.getPerimeter();
		
		Rectangle r1=new Rectangle(12,10);
		r1.getArea();
		r1.getPerimeter();
	}
}
