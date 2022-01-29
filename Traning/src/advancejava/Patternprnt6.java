package advancejava;

import java.util.Scanner;

public class Patternprnt6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int row = 1; row <= n; row++) {
			for (int col = n - 1; col >= row; col--)
				System.out.print(" ");

			for (int tri = 1; tri <= row; tri++)
				if (tri == 1 || row == n)
					System.out.print("*");
				else
					System.out.print(" ");

			for (int col = 2; col <= row; col++) {
				if (row == n || col == row)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

}
