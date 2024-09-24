package printhello;

public class ReturnKeywordSum {
   
	int sum(int a,int b) {
		
		int num=(a+b);
		int c=(a-b);
		int d=(a/b);
		int e=(a*b);
		
		int total=(num+c+d+e);
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnKeywordSum add=new ReturnKeywordSum();
		
		int adding=add.sum(90,70);
		
		System.out.println(adding);

	}

}
