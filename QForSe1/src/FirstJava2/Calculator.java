package FirstJava2;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter operator");
		
		char op=sc.next().trim().charAt(0);
		
		int bag=0;
		
		if(op== '+' || op== '-' || op== '*') {
			System.out.println("enter 2 numbers");
			int x=sc.nextInt();
			int c=sc.nextInt();
			
			
			if(op=='+') {
				bag=x+c;
			}
			
			if(op=='-') {
				bag=x-c;
			}
			
			if(op=='*') {
				bag=x*c;
			}
			
			System.out.println(bag);
		}
	}

}
