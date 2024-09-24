package printhello;

public class ConstructorParameter {
	
	int marks;
	String name;
	ConstructorParameter(){
		
		System.out.println("Empty Cnstructor");
	}
	
	ConstructorParameter(int a,int b){
		
		int c=a+b;
		System.out.println(c);
		System.out.println("Basith");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorParameter obj=new ConstructorParameter();
		ConstructorParameter obj1=new ConstructorParameter(78,90);
		
		System.out.println(obj.marks);
		System.out.println(obj1.name);
		

	}

}
