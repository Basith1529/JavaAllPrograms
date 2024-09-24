package printhello;

public class ColorTrafficLightQ3ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//color traffic light variables
		String c1 = "Red";
		String c2 = "Yellow";
		String c3 = "Green";
		
		String c4 = (c1+c2+c3);
		System.out.println("COLOR TRAFFIC LIGHTS: "+c4);
		
		//1st method
		if(c1.equals("Red")) {
			
			System.out.println("Turn on Red light: STOP");
		}
		
		else if(c2.equals("Red")) {
			
			System.out.println("GET READY");
		}
		
		else if(c3.equals("Red")) {
			
			System.out.println("GO");
		}
		
		//2nd method
		if (c1.equals("Yellow")) {
			
			System.out.println("STOP");
		}
		
		else if(c2.equals("Yellow")) {
			
			System.out.println("Turn on Yellow light : GET READY");
		}
		else if(c3.equals("Yellow")) {
			
			System.out.println("GO");
		}
		
		//3rd method
        if (c1.equals("Green")) {
			
			System.out.println("STOP");
		}
		
		else if(c2.equals("Green")) {
			
			System.out.println("GET READY");
		}
		else if(c3.equals("Green")) {
			
			System.out.println("Turn on Green light : GO");
		}
		
		

	}

}
