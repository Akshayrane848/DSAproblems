package flow;

import java.util.Scanner;

public class Sum2Num {
	
	//Take two numbers and print the sum of both.
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 Numbers");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("sum is "+(num1+num2));
	}

}
