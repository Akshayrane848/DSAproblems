package FirstJava2;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// Take 2 numbers as input and print the largest number.
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter 2 numbers");
		
		int x=sc.nextInt();
		int c=sc.nextInt();
		
		if(x>c) {
			System.out.println(x);
		}
		else {
			System.out.println(c);
		}

	}

}
