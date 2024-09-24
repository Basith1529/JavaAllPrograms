package printhello;

//Multi-Level Inheritance

class A{
	
	int one=1;
}

class B extends A{
	
	int two=2;
}

class C extends B{
	
	int three=3;
}


public class InheritanceMultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1=new C();
		
		System.out.println(c1.three);
		System.out.println(c1.two);
		System.out.println(c1.one);

	}

}
