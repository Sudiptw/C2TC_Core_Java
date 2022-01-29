package advancejava;

import java.util.Scanner;

public class Arithmaticpro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, d, tn, n;

		System.out.println("First Number of AP series:");
		a = sc.nextInt();
		System.out.println("Diffrence of AP series");
		d = sc.nextInt();
		System.out.println("Total numbers in AP series");
		n = sc.nextInt();

		int sum = (n * (2 * a + (n - 1) * d)) / 2;
		tn = a + (n - 1) * d;
		System.out.print("Sum of Series AP:");

		for (int i = a; i <= tn; i = i + d) {
			if (i != tn) {
				System.out.print(i + " ");
			} else {
				System.out.println(i);
				System.out.println("Total :" + sum);

			}
		}
	}

}
