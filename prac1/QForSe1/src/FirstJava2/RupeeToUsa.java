package FirstJava2;

import java.util.Scanner;

public class RupeeToUsa {

	public static void main(String[] args) {
		// Input currency in rupees and output in USD.
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter amout in rs");
		int amt=sc.nextInt();
		
	   System.out.println("usd is "+ amt*74);

	}

}
