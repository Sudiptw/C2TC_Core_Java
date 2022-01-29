package advancejava;

import java.util.Scanner;

public class Geometricpro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float a, r, tn, i;
		int n;
		float sum = 0;

		System.out.println("First Number of GP series:");
		a = sc.nextInt();
		System.out.println("Total numbers of GP series");
		n = sc.nextInt();
		System.out.println("Common ratio of GP series");
		r = sc.nextInt();
		sum = (float) ((a * (1 - Math.pow(r, n + 1))) / (1 - r));
		tn = (float) (a * (1 - Math.pow(r, n - 1)));
		System.out.println("total"+tn);
		System.out.println("sum of "+sum);
	}
}
