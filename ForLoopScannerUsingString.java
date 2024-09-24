package printhello;

import java.util.Scanner;

public class ForLoopScannerUsingString {
  static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the name");
		String name =sc.nextLine();
		for(int i=1;i<=10;i++) {
			
			System.out.println(name);
		}

	}

}
