package advancejava;

import java.util.Scanner;

public class Patternprnt5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    int col, n = 5;
		    for (int row = 1; row < n; row++) {
			for (col = row; col < n; col++) {
				System.out.print(" ");
			}
			for (col = 1; col < row; col++) {
				System.out.print("*");
			}
			for (col = 1; col <= row; col++) {
			    if (row == n && col == row + 1)
					System.out.print("p");
			else
					System.out.print("*");
			}
			System.out.println();
		    }
		    for (int row = 1; row <= n; row++) {
			for (col = 1; col < row; col++) {
				System.out.print(" ");
			}
			for (col = row; col < n; col++) {
		       	 if (col == n && col == row + 1)
					System.out.print("p");
			else if (row == n && col ==row)
					System.out.print("p");
			else
					System.out.print("*");
			}
			for (col = row; col <= n; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}