package trainee;

import java.util.Scanner;

public class Votingassingment {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age;
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Your are eligible for voting");	
		}
		else
		{
			System.out.println("Your are not eligible for voting");
		}
		
		
	}

}
