package program;

enum Direction{North,South,East,West;}
public class Test2ImplementAnEnumSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Direction d;
		d=Direction.East;
		
		switch(d) {
		
		case North:
			
			System.out.println("Check the direction North");
			break;
			
		case South:
			
			System.out.println("Check the direction South");
			break;
			
		case East:
			
			System.out.println("Check the direction East");
			break;
			
		case West:
			
			System.out.println("Check the direction West");
			break;
			
			default:
				System.out.println("Direction of North,South,East,West is wrong");
		}
		
	}

}
