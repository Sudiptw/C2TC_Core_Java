package technoServe;

import java.util.Scanner;

public class UserDefinedexp {

	public static void main(String[] args) {

		System.out.println("Enter Your Age for Registering driving license");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age < 18) {
			throw new InvalidAgeException("Enter a Valid Age for obtaining Driving License");
		} else {
			System.out.println("Approved to apply For Driving License");
		}
	}
}

class InvalidAgeException extends RuntimeException {
	InvalidAgeException(String msg) {
		super(msg);
	}
}