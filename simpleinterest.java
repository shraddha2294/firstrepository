package com.codeboard.project;
import java.util.Scanner;


public class simpleinterest {

	public static void main(String[] args) {
		//p=principal
		//R=rate per annum
		// T=time in years
		//s=simple interest
		int P,R,T,S;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of Principal:");
		System.out.println("Enter  rate per annum:");
		System.out.println("Enter time:");
		
		
		
		P=s.nextInt();
		R=s.nextInt();
		T=s.nextInt();
		
		S=P*R*T/100;
		System.out.println("Simple interest:"+S);
		
	
		
		
		// TODO Auto-generated method stub

	}

}
