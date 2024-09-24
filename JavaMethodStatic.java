package printhello;

public class JavaMethodStatic {
    //static returntype functionname
	static void myStaticMethod (){
		// TODO Auto-generated method stub
		System.out.println("Static methods can be called without created");

	}
	
	//public returntype functionname
	public void myPublicMethod() {
		System.out.println("public methods must be called by creating");
	}
	
	//main method
	public static void main(String[] args) {
		myStaticMethod();//call the static method
		//myPublicMethod(); This would compile an error
		
		JavaMethodStatic myobj = new JavaMethodStatic();//Create an object
		myobj.myPublicMethod();//Call the public method on the object
	}

}
