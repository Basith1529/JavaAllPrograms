package program;

public class MethodUsingSkeletonpara {
	
	public int subNumbers(int x,int y) {
		
		int subtract=x-y;
		
		//return a value
		return subtract;
	}
	
	public int subNumbers1(int x,int y,int z) {
		
		int subtract=x-y-z;
		
		return subtract;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=50,num2=30,num3=10;
		
		//Two Integer
		MethodUsingSkeletonpara sub=new MethodUsingSkeletonpara();
		
		//calling the method
		int outcome=sub.subNumbers(num1, num2);//Arguments
		
		System.out.println("The Result is :"+outcome);
		
		//Three Integer
		MethodUsingSkeletonpara sub1=new MethodUsingSkeletonpara();
		
		System.out.println();
		
		//calling the method
		int outcome1=sub1.subNumbers1(num1,num2,num3);//Arguments
		
		System.out.println("The Result is :"+outcome1);

	}

}
