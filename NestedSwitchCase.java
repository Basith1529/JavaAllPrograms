package program;

public class NestedSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char branch='C';
		int collegeyear=4;
		
		switch(collegeyear) {
		
		case 1:
			System.out.println("English,Maths,Science");
			break;
			
		case 2:
			switch(branch) 
			{
			
			case 'C':
			System.out.println("Operating system,Java,Data Structure");
			break;
			
			
		case 'E':
			System.out.println("Microprocessor,Logic Switching");
			break;
			
		case 'M':
			System.out.println("Manufacturing Machine");
			break;
			}
			break;
			
			
		case 3:
			
			switch(branch) {
			
			case 'C':
				System.out.println("Computer Organization");
			    break;
			    
			    case 'E':
			    	System.out.println("Electronics");
			    	break;
			    	
			    case 'M':
			    	System.out.println("Mechanical Department");
			    	break;
			}
			break;
			
            case 4:
			
			switch(branch) {
			
			case 'C':
				System.out.println("Computer Science");
			    break;
			    
			    case 'E':
			    	System.out.println(" Electricals & Electronics ");
			    	break;
			    	
			    case 'M':
			    	System.out.println("Mechanical Engineering");
			    	break;
			}
			
			
		
		}

	}

}
