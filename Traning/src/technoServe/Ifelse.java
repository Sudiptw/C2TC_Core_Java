package technoServe;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a > 95) {
			System.out.println("You're passed with A grade");
		} else if (a > 85) {
			System.out.println("You're Passed with B grade");
		} else if (a > 75) {
			System.out.println("You're Passed with c grade");
		} else {
			System.out.println("you are failed!!! Sorry");
		}

		if (a > 90)
			System.out.println("You're passed with A grade");
		else if (a > 80)
			System.out.println("You're Passed with B grade");
		else if (a > 75)
			System.out.println("You're Passed with c grade");

	}
}
