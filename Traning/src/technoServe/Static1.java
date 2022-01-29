package technoServe;

public class Static1 {
	static int a;

	public static void main(String[] args) {
		System.out.println("Executing the main block");
		System.out.println(a);
		m();
	}

	static void m() {
		System.out.println("I am Static block ");
	}

	static {
		System.out.println("India is best");
	}
	static {
		System.out.println("Vande mataram");
	}

}
