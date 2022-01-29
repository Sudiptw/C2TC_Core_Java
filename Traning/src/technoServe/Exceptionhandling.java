package technoServe;

public class Exceptionhandling {

	public static void main(String[] args) {
		try
		{
			int a=15/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}
