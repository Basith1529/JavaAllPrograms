package printhello;

//Single Inheritance

class Animal{
	
	void eat() {
		
		System.out.println("The Animal can eat");
	}
}

class Dog extends Animal{
	
	void bark() {
		
		System.out.println("Barks");
	}
}

public class InheritanceSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1= new Dog();
		
		d1.bark();
		d1.eat();

	}

}
