package printhello;

import java.util.*;

public class Q6 {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Name");
		
		String name =sc.nextLine();
		
		System.out.println("Enter the Score");
		float score = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Enter the Department");
		String depart = sc.nextLine();
		
		System.out.println("My name is "+name);
		System.out.println("My Score is "+score/10);
		System.out.println("My Department is "+depart);

	}

}
