package trainee;

import java.util.Scanner;

public class Assingmentequalls {
	public static void main(String[] args) {
		System.out.println("enter your letter");
		Scanner sc=new Scanner(System.in);
		
		String ch;
		ch=sc.next();
		
		if("a".equalsIgnoreCase(ch) || "e".equalsIgnoreCase(ch)||"i".equalsIgnoreCase(ch) ||
				"o".equalsIgnoreCase(ch) || "u".equalsIgnoreCase(ch)) 
		{
			System.out.println("Your enterd letter is vowels");
		}
	 else {
		System.out.println("Your enterd letter is  constants");
	   }
	}	
}
//		
//	Scanner sc=new Scanner(System.in);
//		String ch;
//	System.out.println("enter an alphabet");
//		ch=sc.next();
//		
//		if (ch.equals("a"))
//		{
//			System.out.println("Apple");
//		}
//		else if(ch.equals("b"))
//		{
//			System.out.println("Ball");
//		} 
//		else if(ch.equals("c"))
//		{
//			System.out.println("Cat");
//		}
//		else
//		{
//			System.out.println("Dog");
//		}
//		
//	}
//
//}
