package com.codeboard.project;
import java.util.Scanner;


public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of rectangle:");
		System.out.println("Enter the breadth of rectangle:");
		System.out.println("Enter the radius of circle:");
		Scanner s= new Scanner(System.in);
		double   length,breadth,radius,area,circumference;
		double pi;
		pi=3.142;
		
		
		
		
		 length=s.nextFloat();
		 breadth=s.nextFloat();
		 radius=s.nextFloat();
		 area=length*breadth;
		 circumference=2*pi*radius;
		 System.out.println("Area of rectangle:"+area);
		 System.out.println("Circumference of circle:"+circumference);
		 
		 
		 
		 
		 
		
		
		
		

	}

}
