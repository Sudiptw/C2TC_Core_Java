package advancejava;

import java.util.Scanner;

public class Whiletripatrn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		while (row <= n) {
			int col = row;
			while (col <= n) {
				System.out.print(" ");
				col++;
			}
			int col1 = 1;
			while (col1 <= row) {
				System.out.print("*");
				col1++;
			}
			int col2 = 1;
			while (col2 < row) {
				System.out.print("*");
				col2++;
			}

			System.out.println();
			row++;

		}
	}

}
