package FirstJava2;

import java.util.Scanner;

public class SimpleInterase {

	public static void main(String[] args) {
		// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
			
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter principal amt");
		int principal=sc.nextInt();
		
		System.out.println("enter rate");
		int rate=sc.nextInt();
		
		
		System.out.println("enter time");
		int time=sc.nextInt();
		
		
		System.out.println(principal*rate*time/100);
	}

}
