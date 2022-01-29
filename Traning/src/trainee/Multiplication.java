package trainee;

import java.util.Scanner;

public class Multiplication{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		int a,b,c;
		System.out.println("Input value for a");
		a=sc.nextInt();
		System.out.println("Input vaue for b");
		b=sc.nextInt();
	    c=a*b;
	    System.out.println("Multiplication of Two Number are  "+c);
		
	}
	
}
