package trainee;

import java.util.Scanner;

public class Loginassingment {
	public static void main(String[] args) { 
	login();
	}
	public static void login() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter username");
		 String username=sc.next();
		 System.out.println("Enter Password");
		 int password=sc.nextInt();
		 
		 if(username.equals("sudipt") && password==12345){
		 System.out.println("login succesfull");
		 information();
	     }
	     else
	     {
		 System.out.println("It seems like you're here for first time !!! Please Sign up .\n");
		 register();
	     }
      	 }
	     
		 public static void information() {
		 System.out.println("welcome account succesfully login.");
		 }
 
		 public static void register() {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter your name");
			 String username=sc.next();
			 System.out.println("enter your password");
			 int password=sc.nextInt();
			 System.out.println("signup done !! please login again.\n");
			 
			 login();
		 } 
		 }
		 


