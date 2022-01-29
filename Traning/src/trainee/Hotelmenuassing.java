package trainee;

import java.util.Scanner;

public class Hotelmenuassing {
public static void main(String[] args) {
    
	Scanner sc=new Scanner(System.in);
	System.out.println("******Navratna*******");
	System.out.println("1.Veg^^^^2.Nonveg");
	
	int m;
	do {
	int choise=sc.nextInt();
	
	switch(choise){
	case 1:
		System.out.println("Welcome to have pure veg");
		System.out.println("Press 1 for Pav bhaji "+ "2 for Misal pav"+ "3 for rasam rice");
		int veg=sc.nextInt();
		
	switch(veg) {
	case 1:
		System.out.println("Thankyou you'll recive your Pav bhaji soon ");
		break;
	case 2:
		System.out.println("Thankyou you'll recive your misal Pav soon");
		break;
	case 3:
		System.out.println("Thankyou you'll recive your rasam rice soon");
		break;
	
        default:System.out.println("invalid option");	
	}break;
	case 2:
		System.out.println("welcome to have non veg ");
		System.out.println("press 1 for chicken handi **2 for shawrma**3 for chicken biryani**");
		int nonveg=sc.nextInt();
		
		switch(nonveg) {
		case 1:
			System.out.println("Thankyou you'll recive your chicken handi soon");
			break;
		case 2:
			System.out.println("Thankyou you'll recive your Shawrma soon");
			break;
		case 3:
			System.out.println("Thankyou you'll recive your chicken biryani soon");
			break;
		    default:System.out.println("invalid option");
		}  
		break;
	    }   
	System.out.println("do you wanna order more");
		System.out.println("1.yes 2.no");
	
	        m=sc.nextInt();
	}while(m!=2);  
	System.out.println("thanks your order will be soon on your table");
		
	}
}

