package program;

public class MethodFun {
          private static int getsquare(int x) {
		
		return x*x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//access modifier returntype funname(int,int,String)
		//public void func(int,int);
		//void func(double);
		//void func(int)
		
		for(int i=1;i<=5;i++) {
			
			//method call
			int result=getsquare(i);
			System.out.println("Square of i "+i+" "+result);
		}
		//method call using object
		MethodFun mf=new MethodFun();
		int number=mf.getsquare(3);
		System.out.println();
		System.out.println("The multiple number: "+number);

	}

}
