package printhello;

public class ParameterConstructor {
	
	int marks;
	String name;
	
	ParameterConstructor(){
		
		System.out.println("Hello");
	}
	ParameterConstructor(int a,int b){
		
		System.out.println(a+b);
		System.out.println("Value");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterConstructor obj=new ParameterConstructor();
		System.out.println();
		ParameterConstructor obj1=new ParameterConstructor(20,25);

	}

}
