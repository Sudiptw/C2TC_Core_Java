package technoServe;

public class Method_overloading1 {

	public void m(Object o) {
		System.out.println("Object class");
	}
	public void m(String s) {
		System.out.println("String class");

	}
	public static void main(String[] args) {
		Method_overloading1 obj=new Method_overloading1();
		obj.m(new Object());
	}
}

