package advancejava;

import java.util.Scanner;

public class Patternspcetri {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= row; space++) {
				System.out.print(" ");
			}
			for (int col = row; col <= n; col++) {
				if (row == 1 || row == col)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for (int col = row; col < n; col++) {
				if (row == 1 || col == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
