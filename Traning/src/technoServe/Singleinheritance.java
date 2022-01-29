package technoServe;

class A {
	void Apple() {
		System.out.println("Apple");
	}
}

class B extends A {
	void Ball() {
		System.out.println("Ball");
	}
}

public class Singleinheritance {
	public static void main(String[] args) {

		B b = new B();
		b.Apple();
		b.Ball();
	}
}
