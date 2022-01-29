package advancejava;

import java.util.Scanner;

public class Patterntimer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int col, n = sc.nextInt();
		for (int row = 1; row < n; row++) {
			for (col = 1; col < row; col++) {
				System.out.print(" ");
			}
			for (col = row; col < n; col++) {
				System.out.print("*");
			}
			for (col = row; col <= n; col++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int row = 1; row <= n; row++) {
			for (col = row; col < n; col++) {
				System.out.print(" ");
			}
			for (col = 1; col < row; col++) {
				System.out.print("*");
			}
			for (col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
