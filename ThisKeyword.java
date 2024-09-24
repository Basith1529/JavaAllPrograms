package printhello;

public class ThisKeyword {
	int marks;
	
	String myname;
	 ThisKeyword(){
		 
		 System.out.println("Hello");
	 }
	 
	 public void display() {
		 
		 System.out.println("Display the Value");
		 
	 }
	 
	 public void setname(String myname) {
		 
		 this.myname=myname;
	 }
	 
	  void setname(int a,String b) {
		 
		 marks=a;
		 myname=b;
		
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword obj = new ThisKeyword ();
		obj.display();
		obj.setname("Basith");
		System.out.println(obj.myname);
		obj.setname(23,"Sugai");
		System.out.println(obj.marks);
		System.out.println(obj.myname);
		

	}

}
