package trainee;

import java.util.Scanner;

public class Datatype {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String name;
		float height;
		double weight;
		String age;
		boolean eligibleforvoting;
		
		System.out.println("enter your name");
		name=sc.next();
	    System.out.println("enter your height");
		height=sc.nextFloat();
		System.out.println("enter your weight");
		weight=sc.nextDouble();
		System.out.println("enter your age");
		age=sc.next();
		eligibleforvoting=true;
		System.out.println("name:"+name+"  "+height+"  "+weight+"  "+age+"  "+eligibleforvoting);
		
	}
}
