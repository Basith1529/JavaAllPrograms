package program;

public class AllMethodOfReverseNumber{
		// TODO Auto-generated method stub
    
	void print(int e,int f,int g,int h,int m,int n) {
		System.out.println("Funtion parameters");
		
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(m);
		System.out.println(n);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		
		//forloop
		System.out.println("For Loop");
		for(int i=500;i>=a;i=i-100) {
			
			System.out.println(i);
			
		}
		System.out.println();
		//for each loop
		System.out.println("For Each Loop");
		int num[]= {500,400,300,200,100,0};
		
		for(int sum:num) {
			
			System.out.println(sum);
		}
		System.out.println();
		//while loop
		System.out.println("While Loop");
		int j=500;
		int b=0;
		
		while(j>=b) {
			
			System.out.println(j);
			
			j=j-100;
		}
		System.out.println();
		
		
		//do while loop
		System.out.println("Do While Loop");
		int k=500;
		int c=0;
		
		do {
			
			System.out.println(k);
			k=k-100;
		}while(k>=c);
		System.out.println();
		
		//using ifcondition
		System.out.println("Ifcondition");
		int l=500;
		int d=0;
		
		if(l>=d) {
			
			System.out.println(l);
			l=l-100;
		}
        if(l>=d) {
			
			System.out.println(l);
			l=l-100;
		}
        if(l>=d) {
	
	       System.out.println(l);
	       l=l-100;
       }
        if(l>=d) {
	
	      System.out.println(l);
	      l=l-100;
       }
        if(l>=d) {
	
     	System.out.println(l);
	    l=l-100;
        }
         if(l>=d) {
	
	    System.out.println(l);
	    l=l-100;
        }
         System.out.println();
         //Using Function
         
         AllMethodOfReverseNumber loop=new AllMethodOfReverseNumber();
         
         loop.print(500, 400, 300, 200, 100, 0);
         

	}

}
