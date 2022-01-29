package advancejava;

import java.util.Scanner;

public class Whiledaipatrn {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		while (i < n) {
			int space = i;
			while (space <= n) {
				System.out.print(" ");
				space++;
			}
			int tri1 = 1;
			while (tri1 <= i) {
				System.out.print("*");
				tri1++;
			}
			int tri2 = 2;
			while (tri2 <= i) {
				System.out.print("*");
				tri2++;
			}
			System.out.println();
			i++;
		}

		int i1 = 1;
		while (i1 <= n) {
			int space1 = 1;
			while (space1 <= i1) {
				System.out.print(" ");
				space1++;
			}
			int tri11 = i1;
			while (tri11 <= n) {
				System.out.print("*");
				tri11++;
			}
			int tri22 = i1;
			while (tri22 <= n - 1) {
				System.out.print("*");
				tri22++;

			}
			System.out.println();
			i1++;
		}

	}

}
