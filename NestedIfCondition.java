package program;

public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age =20;
		int weight=49;
		
		
		if(age>=20) {
				
			
			if(weight>50)
				
				System.out.println("You are eligible to donate blood");
				
				else {
					
					System.out.println("Your age must be more than 20 to donate blood");
				}
		}
				
			
			
			else {
				
				System.out.println("You are not eligible to donate blood");
			}
		}

	}


