package advancejava;

import java.util.Scanner;

public class Factoraial {

	static int factorial(int n) {
		int res = 1, i;
		for (i = 1; i <= n; i++)
			res *= i;
		return res;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number you want:");
		num = sc.nextInt();
		System.out.println("Factorial of " + num + " is :" + factorial(num));

	}
}
