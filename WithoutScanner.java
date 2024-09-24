package printhello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WithoutScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader(is);

		int num , num2;
		String str[]=new String[2];

		System.out.print("Please Enter Your First Number:");
		str[0] = stdin.readLine();
		System.out.print("Please Enter Your Second Number:");
		str[1] = stdin.readLine();

		num = Integer.parseInt(str[0]);
		num2 = Integer.parseInt(str[1]);
	}

}
