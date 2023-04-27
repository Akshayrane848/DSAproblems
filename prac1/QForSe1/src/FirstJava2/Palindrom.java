package FirstJava2;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// To find out whether the given String is Palindrome or not.
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string");
		String name=sc.next();
	
		
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--) {
			rev+=name.charAt(i);
		}
		
		if(name.equalsIgnoreCase(rev)) {
			System.out.println("Yes");
		}else {
			System.out.println("NO");
		}

	}

}
