package trainee;

import java.util.Scanner;

public class evenorodd {
   public static void main(String[] args) {

	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter your value");
	   int number =sc.nextInt();
	   if(number%2==0) {
		   System.out.println("even");
		    }
	   else {
		   System.out.println("odd");
	   }   
   }
}
