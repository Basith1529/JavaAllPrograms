package program;

import java.util.*;
public class Test4InputInteger {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        // Prompt user to enter an integer between 0 and 1000
		        System.out.print("Enter an integer between 0 and 1000: ");
		        int number = sc.nextInt();
		        // Ensure the input is within the valid range
		        if (number < 0 || number > 1000) {
		            System.out.println("The number must be between 0 and 1000.");
		        } else {
		            // Extract each digit and calculate the sum
		            int sum = 0;
		            
		            while (number > 0) {
		                sum += number % 10;  // Add the last digit to the sum
		                number = number / 10; // Remove the last digit
		            }

		            // Display the sum of the digits
		            System.out.println("The sum of the digits is: " + sum);
		        }

		        // Close the scanner
		       
		    }
		


	}


