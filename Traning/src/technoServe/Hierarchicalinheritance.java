package technoServe;

class Vehicals{
	void vehicals() {
		System.out.println("Vehicals :");
	}
}
class Car extends Vehicals{
	void car() {
		System.out.println("BMW");
	}
}
class Truck extends Car{
	void truck() {
		System.out.println("Volvo");
	}
}

public class Hierarchicalinheritance {

	public static void main(String[] args) {
		 Truck t = new Truck();
		 t.vehicals();
		 t.car();
		 t.truck();
	}
}
