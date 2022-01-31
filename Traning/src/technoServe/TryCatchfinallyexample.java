package technoServe;

public class TryCatchfinallyexample {

	public static void main(String[] args) {
		
		int[] i=new int[5];
		try {
			System.out.println(i[5]);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Inside Try block");
			
		}
		finally {
			System.out.println("Finally Block Executed");
		}
		System.out.println("Outside try_catch-finaly clause");
	}
}
