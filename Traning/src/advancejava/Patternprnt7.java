package advancejava;

import java.util.Scanner;

public class Patternprnt7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int space = i; space <= n; space++) {
				System.out.print(".");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}