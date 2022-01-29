package trainee;
import java.util.Scanner;
public class Mainmethod {
	
	static int x,y; 
	public static void main(String[] args) {
	 
    input();
	int c=mult(x,y);
	System.out.println("Multiplication of two Number is "+c);
	input();
	int d=sub(x,y);
	System.out.println("Addition of two number is "+d);
}  
	public static void input() {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your values");	
	x=sc.nextInt();
	y=sc.nextInt();	
}    
         public static int mult( int x,int y) {
	return x*y;
		}public static int sub(int x,int y) {
	return x-y;
			
		}
	}


