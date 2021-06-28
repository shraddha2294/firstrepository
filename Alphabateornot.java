package com.codeboard.project;
import java.util.Scanner;


public class Alphabateornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner s= new Scanner(System.in);
		System.out.println("Enetr the Character:");
		ch=s.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A'&& ch<='Z'))
		{System.out.println(ch+ " is an Alphabate");
		
		}
		else
		{System.out.println(ch + " is  not an Alphabate");
		
		
		

	}

}
}
