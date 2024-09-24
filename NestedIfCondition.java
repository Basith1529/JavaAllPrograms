package printhello;

public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean kfc= true; // or false
		boolean chicken=true; // or false
		boolean pepsi=true;  // or false
		
		
		if(kfc) {
			System.out.println("Enter into KFC");
			
			if(chicken) {
				System.out.println("Eating CHICKEN");
				
				if(pepsi) {
					System.out.println("Drinking PEPSI");
				}
			}
		}

	}

}
