package printhello;

import java.util.*;

public class NestedIfConditonScanner {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method
		System.out.println("Enter the boolean value");
		
		boolean kfc =sc.nextBoolean();
		boolean chicken =sc.nextBoolean();
		boolean pepsi =sc.nextBoolean();
		
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
