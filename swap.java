package com.codeboard.project;
import java.util.Scanner;




public class swap {

	public static void main(String[] args) {
		System.out.println("Enter first number:");
		System.out.println("Enter second number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+" b="+b);
		
		// TODO Auto-generated method stub

	}

}
