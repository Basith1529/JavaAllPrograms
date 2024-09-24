package printhello;
//Switch statement used to execute different cases based on equiality

public class SwitchCaseConditon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char attendance ='A';
//		int attendance = 2;
		
		
		switch(attendance) {
		
		case 'O'://1:
			System.out.println("On-Duty");
			break;
			
		case 'P'://2:
			System.out.println("Attend the class");
			break;
			
		case 'A':// 3:
			System.out.println("Not attend the class");
			break;
			
			default:
				System.out.println("Invalid");
		  
		}

	}

}
