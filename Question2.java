package com.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Shape{
	String name;
	
	public Shape(String name) {
		super();
		this.name = name;
	}
	abstract double calculate_area();
	abstract void Display();
}
class Circle extends Shape{
	float radius;
	
	public Circle(String name, float radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	double calculate_area() {
		
		return (3.14*radius*radius);
	}

	@Override
	void Display() {
		System.out.println("Name of the shape is : "+name+", \nRadius of shape is :"+radius+"\nArea is :"+calculate_area());
		
	}
	
}
class Rectangle extends Shape{
	double length;
	double width;
	
	public Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}

	@Override
	double calculate_area() {
		
		return length*width;
	}

	@Override
	void Display() {
		System.out.println("Name of the shape is : "+name+", \nlength of rectangle is :"+length+"\nThe width of rectangle is : "+width+"\nArea is :"+calculate_area());
		
	}
	
}
class Triangle extends Shape{
	double base;
	double height;
	
	public Triangle(String name, double base, double height) {
		super(name);
		this.base = base;
		this.height = height;
	}

	@Override
	double calculate_area() {
		
		return (0.5*base*height);
	}

	@Override
	void Display() {
		System.out.println("Name of the shape is : "+name+", \nBase of triangle is :"+base+"\nHeight of triangle is : "+height+"\nArea is :"+calculate_area());

		
	}
	
}

public class Question2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circle c1;
		Rectangle r1;
		Triangle t1;
		try {
			System.out.println("Enter Name of Shape like circle,rectangle,triangle: ");
			String ShapeName=sc.nextLine();
			if (ShapeName.equalsIgnoreCase("circle")) {
				System.out.println("Enter radius ");
				float radius=sc.nextFloat();
				c1=new Circle(ShapeName, radius);
				c1.Display();
			}else if (ShapeName.equalsIgnoreCase("rectangle")) {
				System.out.println("Enter length of rectangle : ");
				 double length=sc.nextDouble();
				System.out.println("Enter width of rectangle : ");
				 double width=sc.nextDouble();
				 r1=new Rectangle(ShapeName, length, width);
				 r1.Display();
			}else if(ShapeName.equalsIgnoreCase("triangle")){
				System.out.println("Enter base of triangle : ");
				double base=sc.nextDouble();
				System.out.println("Enter height of triangle :");
				double height=sc.nextDouble();
				t1=new Triangle(ShapeName, base, height);
				t1.Display();
			}else {
				System.out.println("wrong shape name ");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Wrong input by user");
			System.out.println(e.getMessage());
		}

		
	}
}
