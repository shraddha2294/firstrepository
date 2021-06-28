package com.codeboard.project;
import java.util.Scanner;


public class largest {

	public static void main(String[] args) {
		System.out.println("Enter First Number:");
		System.out.println("Enter Second  Number:");
		System.out.println("Enter Third  Number:");
		Scanner s=new Scanner(System.in);
		double n1,n2,n3;
		n1=s.nextDouble();
		n2=s.nextDouble();
		n3=s.nextDouble();
		if(n1==n2 ||n1==n3|| n2==n3)
		{if(n1==n2)
			System.out.println(n1+" and "+n2+" are equal");}
		 
			System.out.println("Given numbers are equal");
		
		else {
		if(n1>=n2 && n1>=n3)
		System.out.println(n1+" is the largest number.");
		else if(n2>=n1 && n2>=n3)
			System.out.println(n2+ " is the largest number");
		else
			System.out.println(n3+" is the largest Number:");
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
}
