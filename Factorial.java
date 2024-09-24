package printhello;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int fact= 1;
		int a=10;
		
		for(int i=1;i<=a;i++) {
			
			if(i % 2 == 0) {
				
				sum=sum+i;
			
			}
			else {
				fact=fact*i;
			}		
		}
		if(sum % 2 == 0)
		{
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		System.out.println(sum);
		if(fact % 2 == 0)
		{
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		System.out.println(fact);
		
		System.out.println("Total");
		
		int d = sum+fact;
		System.out.println(d);
		
		if(d % 2 == 0)
		{
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		int e = fact-sum;
		System.out.println(e);
		
		if(e % 2 == 0)
		{
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		int f = fact/sum;
		System.out.println(f);
		
		if(f % 2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
		if(sum%2==0 && fact%2==0 && d%2==0 && e%2==0 && f%2==0)
		{
			System.out.println("odd");
		}
		else {
			System.out.println("invalid");
		}
		
		
		
		

	}

}
