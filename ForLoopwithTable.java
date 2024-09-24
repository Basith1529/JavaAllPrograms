package printhello;

import java.util.Scanner;

public class ForLoopwithTable {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter any number");
		int a=sc.nextInt();	
		System.out.println("enter the end value");
		int b=sc.nextInt();
		System.out.println("WHICH TABLE U WNAT ENTER HERE");
		int c=sc.nextInt();	
		
		
			for(int i=a;i<=b;i++) {
			
				System.out.println(i+"x"+c+"="+i*c);
							}
		
		}

	}
