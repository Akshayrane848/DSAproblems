package flow;

import java.util.Scanner;

public class InfiniteWhileLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int sum=0;
		while(true) {
			System.out.println("enter number for sum");
			int num=sc.nextInt();
			
			sum+=num;
			
			System.out.println("enter more number y/n");
			String ch=sc.next();
			
			
			if(ch.equals("n")) {
				break;
			}
		}
		
		System.out.println(sum);
	}
}
