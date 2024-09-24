package program;

public class StaticMethod {
	
	//Using Static Method
	static void staticNumber(int a,int b){
		
		int c=a+b;
		System.out.println("Adding the Static Method Add Number :"+c);
	}
	
	//Using Public Method
	public void publicNumber(int a,int b) {
		
		int c=a+b;
		
		System.out.println("Adding public method Add Number :"+c);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethod obj=new StaticMethod();
		
		staticNumber(20,70);//using static method
		
		System.out.println();
		
		obj.publicNumber(60,20);//using public method
		

	}

}
