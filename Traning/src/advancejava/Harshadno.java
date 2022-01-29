package advancejava;

import java.util.Scanner;

public class Harshadno {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,rem=0,sum=0,n;
		System.out.println("Enter your value");
		num=sc.nextInt();
		
		n=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if (n%sum==0)
			System.out.println(n+": is a harshad number");
		else
			System.out.println(n+": is not a harshad number");
	}

}