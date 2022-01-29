package advancejava;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		n = sc.nextInt();
		int sum = 0;

		while (n!=0) {
			sum=sum + n % 10;
			n=n/10;
		}
		
		System.out.println("your answer is:"+sum);
	}

}
