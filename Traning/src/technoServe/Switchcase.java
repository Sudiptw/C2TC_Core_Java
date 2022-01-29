package technoServe;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to vistar hotel");
		System.out.println("What would you like to have");
		System.out.print("Press 1:For veg 2:For Non-Veg");
		
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			System.out.println("In veg what would you like to order" + "1:Veg kolhapuri 2:Malai kofta 3:Pav-bhaji");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Your order is placed for Veg kolhapuri");
				break;
			case 2:
				System.out.println("your order is placed for malai kofta");
				break;
			case 3:
				System.out.println("Your order is placed for Pav-bhaji");
				break;
			}
			break;

		case 2:
			System.out.println("In Non-veg what would you like to have" + "1:Butter Chicken 2:Paplet 3:Surmai");

			choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Your order has been placed for Butter Chicken ");
				break;
			case 2:
				System.out.println("Your order has been placed for Paplet");
				break;
			case 3:
				System.out.println("Your order Has been placed for Surmai");
				break;
			}
		default:
		}
	}
}
