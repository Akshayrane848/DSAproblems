package FirstJava2;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// Write a program to print whether a number is even or odd, also take input from the user.

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		int num=sc.nextInt();
		
		String ans="Prime";
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				ans="Not prime";
				break;
			}
		}
		
		System.out.println(ans);
	}

}
