package program;

import java.util.Scanner;
public class TrMamTask1UserWhileLoop {
	   static Scanner sc = new Scanner(System.in);
	   
	    public static void main(String[] args) {
	       
	        String name = "";
	        String address = "";
	        int pincode =0;
	        int age=0;
	        
//	           int a= 1;
	           int i=1;
//	           for(int i=1;i<=a;i++) {
	            while (i <= 1) {
	            
	            System.out.print("Enter your name: ");
	            name = sc.nextLine();
	            
	           
	            System.out.print("Enter your age: ");
	            age = sc.nextInt();
	            sc.nextLine();  
	            
	            
	            System.out.print("Enter your address: ");
	            address = sc.nextLine();
	            
	            
	            System.out.print("Enter your pincode: ");
	            pincode = sc.nextInt();
	            
//	           }
	            i++;
	        }
	        System.out.println();
	        
	        System.out.println("User Information");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	        System.out.println("Pincode: " + pincode);
	        
//	        System.out.println();
//	        
//	        System.out.println("User Information 2");
//	        System.out.println("Name: " + name);
//	        System.out.println("Age: " + age);
//	        System.out.println("Address: " + address);
//	        System.out.println("Pincode: " + pincode);
	        
	    }
	}

