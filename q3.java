package printhello;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);
        
        // Ask the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        // Check if the second number is zero to avoid division by zero
        if (num2 != 0) {
            int result = num1 / num2;
            System.out.println("The result of dividing " + num1 + " by " + num2 + " is: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        
        sc.close();
    }
}
