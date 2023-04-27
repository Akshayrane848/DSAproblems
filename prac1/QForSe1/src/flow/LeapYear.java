package flow;

import java.util.Scanner;

public class LeapYear {
	
	
	//Input a year and find whether it is a leap year or not.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter Year");
		int year =sc.nextInt();
		
		if(((year%4==0) && (year%100 !=0)) || (year%400==0)) {
			System.out.println(year+" this year is leapyear");
		}
		else {
			System.out.println(year+" this year is not leapyear");
		}

	}

}
