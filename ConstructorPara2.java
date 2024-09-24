package printhello;

public class ConstructorPara2 {
	
	int marks;
	String name;
	ConstructorPara2(int a,String b){
		
		marks=a;
		name=b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorPara2 obj=new ConstructorPara2(32,"Basith");
		ConstructorPara2 obj1=new ConstructorPara2(45,"Ahamed");
		
		System.out.println(obj1.marks);
		System.out.println(obj.name);
		System.out.println(obj.marks);
		System.out.println(obj1.name);
	}

}
