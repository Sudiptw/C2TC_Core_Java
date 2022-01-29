package technoServe;

class Vehical{
	void Car() {
		System.out.println("Maruti800");
	}
}

class Maruti extends Vehical {
	void brand() {
		System.out.println("Maruti suzuki");
	}
}

class Maruti800 extends Maruti{
	void speed () {
		System.out.println("90km");
	}
}

public class MultiLevelinheritance {

	public static void main(String[] args) {

		Maruti800 m = new Maruti800();
		m.brand();
		m.Car();
		m.speed();
	}
}
