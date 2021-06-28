package com.codeboard.project;
import java.util.Scanner;


public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter the Character:");
		
		Scanner s=new Scanner(System.in);
		ch= s.next().charAt(0);
		if((ch>='a'&& ch<='z')||ch>='A'&&ch<='Z')
		{
		switch(ch) {
		
		case 'a':
			System.out.println("It is vowel");
			break;
		case 'e':
			System.out.println("It is vowel");
			break;
		case 'i':
			System.out.println("It is vowel");
			break;
		case 'o':
			System.out.println("It is vowel");
			break;
		case 'u':
			System.out.println("It is vowel");
			break;
		default:
			System.out.println("It is  consonant ");
			break;
			
	}

}
		else
		{
			System.out.println("It is not an alphabate.");
		}
}
}
	
