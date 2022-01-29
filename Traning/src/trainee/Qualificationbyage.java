package trainee;

import java.util.Scanner;

public class Qualificationbyage {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter your age");
		age=sc.nextInt();
		if(age>20) {
			System.out.println("Degree ");
		}
		else if(age>18)
		{
			System.out.println(" High School");
		}
		
		else if(age>13)
		{
			System.out.println("School");
		}
		else {
			System.out.println("Primary");
			
		}
   }  

}
