package printhello;

import java.util.Scanner;

public class ForLoop {
     static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("eneter the number");
        int a =sc.nextInt();
//            for(int i=1;i<=a;i++) {
//        	System.out.println(i);
//        	System.out.println("Enter the 1 to 10 numbers");
//        	System.out.println("Enter the 11 to 20 numbers");
//        	System.out.println("Enter the 21 to 30 numbers");
        	
        	if(a>=1 && a<=10) {
        		
        		System.out.println("hi");
        	}
        	else if(a>=11 && a<=20){
        		System.out.println("hello");
        		
        	}
        	else if(a>=21 && a<=30) {
        		
        		System.out.println("gm");
        	}
        	else {
        		
        		System.out.println("bye");
        	}
        //}
	}

}
