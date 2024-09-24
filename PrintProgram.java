package printhello;

import java.lang.System;
import java.util.Scanner;

public class PrintProgram 
{
	static Scanner sc = new Scanner(System.in); 
	public static void main (String args[]) {
		System.out.println("Enter Your Numbers A");
		int a =sc.nextInt();
		System.out.println("Enter Your Numbers B");
		int b =sc.nextInt();
		for(int i=a;i<=b;i=i-1) {
       
	System.out.println(i);
		}
	}
}
