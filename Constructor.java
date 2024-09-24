package printhello;

public class Constructor {
	
	int marks;
	String name;
	
	Constructor(){
		
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor obj=new Constructor();
//		System.out.println(obj.marks);
//		System.out.println(obj.name);
		Constructor obj1=new Constructor();
		
		System.out.println(obj.marks);
		System.out.println(obj1.marks);
		System.out.println(obj.name);
		

	}

}
