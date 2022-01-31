package technoServe;

import java.util.Scanner;

public class Leapyearassingment {
	public static void main(String[] agrs) {
		
		System.out.println("Enter your year");
		Scanner sc=new Scanner(System.in);
		int year;
		year=sc.nextInt();
		
		if((( year% 4 == 0)&&(year%100!=0))|| (year%400==0)) {
			System.out.println("Specified year is a leap year");
		}
		else {
			System.out.println("Specified year is not a leap year");
		}
		
	}

}
