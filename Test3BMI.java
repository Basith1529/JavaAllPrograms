package program;

public class Test3BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Prompt user for weight in kilograms
		        System.out.print("Enter your weight in kilograms: ");
		        double weight = 80.78;

		        // Prompt user for height in meters
		        System.out.print("Enter your height in meters: ");
		        double height = 18.5;

		        // Calculate BMI
		        double bmi = weight / (height * height);

		        // Display the BMI result
		        System.out.println("Your BMI is: "+bmi);
		     

		        // Provide a BMI category based on the calculated value
		        if (bmi < 18.5) {
		            System.out.println("You are underweight.");
		        } else if (bmi >= 18.5 && bmi < 24.9) {
		            System.out.println("You have a normal weight.");
		        } else if (bmi >= 25 && bmi < 29.9) {
		            System.out.println("You are overweight.");
		        } else {
		            System.out.println("You are obese.");
		        }

		        // Close the scanner
		       
		}


	}


