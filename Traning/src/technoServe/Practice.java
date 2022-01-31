package technoServe;

import java.util.Scanner;
    
public class Practice {
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
	int a,b,c;
	a=5;
	b=0;
	try {
	c=a/b;
	System.out.println(c);
	}catch( Exception Arithmatic) {
		System.out.println("Something went wrong");
	}
	
	try {
	c=sc.nextInt();
	}catch(Exception io) {
		System.out.println("Value of c");
	}
	

}
}