package advancejava;

import java.util.Scanner;

public class Patternprnt {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int row, col, n = 5;
		for (row = 1; row <= n; row++) {
			for (col = 1; col <=row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
	}
}
