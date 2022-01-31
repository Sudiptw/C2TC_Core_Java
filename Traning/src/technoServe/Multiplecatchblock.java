package technoServe;

public class Multiplecatchblock {

	public static void main(String[] args) {
		//So in this code we generate the null pointer Exception but we haven't provide 
		//that particular Exception.In such case parent class exception will invoked 
		try {
			String s=null;
		System.out.println(s.length());
		}
		catch(ArithmeticException c){
			System.out.println("Arithmetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Arrayindexoutofboundsexception occurs");
		}
		catch(Exception e){
			System.out.println("Parent Exception occurs");
		}
		System.out.println("Rest of the code");
	}
}
