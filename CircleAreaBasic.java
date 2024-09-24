package printhello;
import java.util.Scanner;

public class CircleAreaBasic {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
  
        String user = "";  
        
      
       
           
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();  // Read the radius as a double

            // Calculate the area of the circle using the formula Area = π * r²
            double area = 3.14159 * radius * radius;  // Use 3.14159 as an approximation for π

            // Print the calculated area
            System.out.println("The area of the circle is: " + area);

            // Ask if the user wants to calculate the area for another circle
            System.out.print("calculate the area of another circle? (yes/no): ");
            user = scanner.next();  // Read the user's response
        
        
        // Close the Scanner object to prevent resource leaks
        scanner.close();
       
        System.out.println("Program terminated.");
       
    }
}
