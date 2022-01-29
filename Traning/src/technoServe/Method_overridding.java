package technoServe;

class vehical1{
	void run() {
		System.out.println("Vehical is running");
	}
}

class Method_overridding extends vehical1 {

	void run() {
		System.out.println("Bike is running safely");
	}
	
	public static void main(String[] args) {
	 Method_overridding b=new Method_overridding();
	 b.run();
	}
}
