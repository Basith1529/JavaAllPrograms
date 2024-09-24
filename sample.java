package printhello;

import java.util.Scanner;

public class sample {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("eneter a nukber");
		int a=sc.nextInt();
		System.out.println("eneter b nukber");
		int b=sc.nextInt();
		for(int i=a;i<=b;i=i++) {
			System.out.println(i);
		}	
	}
}
