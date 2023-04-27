package flow;

import java.util.Scanner;

public class MultiplicationTable {
	
	//Take a number as input and print the multiplication table for it.
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("entre s number");
		int num=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int sum=0;
			sum+=num*i;
			System.out.println(sum);
		}
		
	}

}
