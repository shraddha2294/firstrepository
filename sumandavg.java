package com.codeboard.project;
import java.util.Scanner;

public class sumandavg {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Enter the First Number:");
		System.out.println("Enter the second number:");
		System.out.println("Enter the third number:");
		Scanner s=new Scanner(System.in);
		float a,b,c;
		a=s.nextFloat();
		b=s.nextFloat();
		c=s.nextFloat();
		
		
		
		float  sum;
		float avg;
		sum= a+b+c;
		avg=sum/3;
		System.out.println("sum=" +sum+    "avg="+avg);
		

	}

}
 