package com.codeboard.project;
import java.util.Scanner;


public class remainderandquotient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int remainder,quotient;
		remainder=a%2;
		quotient=a/2;
		System.out.println("remainder="+remainder);
		System.out.println("quotient="+quotient);
	}

}
