package printhello;

public class NestedForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int j=1;j<=3;j++) {
			
			for(int i=1;i<=3;i++) {
				
				System.out.println("*");
			}
			System.out.println();
		}
        
		for(int k=1;k<=3;k++) {
			
			for(int l=1;l<=k;l++) {
				
				System.out.println("*");
			}
			
			System.out.println();
		}
		
	}

}
